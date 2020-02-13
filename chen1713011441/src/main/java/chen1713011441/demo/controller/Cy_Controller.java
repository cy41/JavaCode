package chen1713011441.demo.controller;

import chen1713011441.demo.eneity.cy_Stu;
import chen1713011441.demo.service.chen_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Cy_Controller {
    @Autowired
    private chen_Service cs;

    @GetMapping("/insert/{cy_name}/{cy_origin}")
    @ResponseBody
    public String insert(@PathVariable("cy_name") String cy_name,
                           @PathVariable("cy_origin") String cy_origin){
        cy_Stu cc=new cy_Stu();
        cc.setCy_stu_name(cy_name);
        cc.setCy_stu_origin(cy_origin);
        if(cs.insert(cc)>0){
            return "插入成功，学生信息为：学号:"+cc.getCy_stu_id()+"\n姓名为:"+cc.getCy_stu_name()+"\n籍贯为:"+cc.getCy_stu_origin();
        }
        return "插入失败";
    }

    @GetMapping("/select/{id}")
    @ResponseBody
    public cy_Stu select(@PathVariable("id") int id){
        return cs.select(id);
    }

    @GetMapping("/show/{id}")
    public ModelAndView show(@PathVariable("id") int id,ModelAndView mv){
        mv.addObject("stu",cs.select(id));
        mv.setViewName("/result");
        return mv;
    }

}
