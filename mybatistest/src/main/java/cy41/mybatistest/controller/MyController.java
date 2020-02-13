package cy41.mybatistest.controller;

import cy41.mybatistest.entity.User;
import cy41.mybatistest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    UserService us=null;

    @GetMapping("/getUserById")
    //@ResponseBody
    public ModelAndView getUserById(String id){
        User user=us.getUserById(id);
        ModelAndView mv=new ModelAndView();
        if(user==null){
            mv.setViewName("/fail");
        }
        else{
            mv.addObject("user",user);
            mv.setViewName("/showuser");
        }
        return mv;
    }

    @GetMapping("/insert")
    public String insert(){
        return "/signUp";
    }

    @PostMapping("/insert")
    public ModelAndView insert(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("password") String password,@RequestParam("again") String again){
        ModelAndView mv=new ModelAndView();
        if(id==null||name==null||password==null||again==null||id.equals("")||name.equals("")||password.equals("")||again.equals("")||!(password.equals(again))){
            mv.setViewName("/fail");
        }else{
            User user=new User(id,password,name);
            if(us.insert(user)>0){
                mv.addObject("user",user);
                mv.setViewName("/success");
            }
            else{
                mv.setViewName("/fail");
            }
        }
        return mv;
    }
    @GetMapping("/deleteById")
    @ResponseBody
    public String deleteById(String id){
        return us.deleteById(id)?"success":"fail";
    }

    @GetMapping("/getAll")
    public ModelAndView getAll(ModelAndView mv){
        List<User> list=us.getAll();
        mv.addObject("list",list);
        mv.setViewName("showAll");
        return mv;
    }
    @GetMapping("/deleteAll")
    @ResponseBody
    public String deleteAll(){
        return "删除了"+us.deleteAll()+"条数据";
    }

    @GetMapping("/upd")
    public ModelAndView upd(String id,ModelAndView mv){
        User user=us.getUserById(id);
        if(user==null||user.equals("")){
            mv.setViewName("/fail");
        }
        else{
            mv.addObject("user",user);
            mv.setViewName("/upd");
        }
        return mv;
    }
    @PostMapping("/upd")
    @ResponseBody
    public String upd(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("password") String password,@RequestParam("again") String again){
        if(id==null||name==null||password==null||again==null||id.equals("")||name.equals("")||password.equals("")||again.equals("")||!(password.equals(again))){
            return "修改失败";
        }else{
            User user=new User(id,password,name);
            int row=us.upd(user);
            if(row>0){
                return "修改了"+row+"条数据";
            }
        }
        return "修改失败";
    }
}
