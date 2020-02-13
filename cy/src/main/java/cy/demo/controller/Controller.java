package cy.demo.controller;

import cy.demo.entity.User;
import cy.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@org.springframework.stereotype.Controller

public class Controller {
    @Autowired
    Service service;

    @RequestMapping("/insertform")
    public String insert(){
        return "insert";
    }

    @PostMapping("/hhh")
    @ResponseBody
    public void hello(@RequestParam("name") String name,
                      @RequestParam("sex") String sex,
                      @RequestParam("phone") String phone,
                      @RequestParam("idcard") String idcard, HttpSession session){
        session.setAttribute("name",name);
        session.setAttribute("sex",sex);
        session.setAttribute("phone",phone);
        session.setAttribute("idcard",idcard);
    }
    @PostMapping("/insertIntoTable")
    @ResponseBody
    public String insertIntoTable(HttpSession session) throws Exception {
        String name=(String)session.getAttribute("name");
        String sex=(String)session.getAttribute("sex");
        String phone=(String)session.getAttribute("phone");
        String idcard=(String)session.getAttribute("idcard");
        session.removeAttribute("name");
        session.removeAttribute("sex");
        session.removeAttribute("phone");
        session.removeAttribute("idcard");
        User user=new User();
        int row=service.insert(name,sex,phone,idcard);
        if(row>0){
            String log="用户名为："+name+"，性别为："+sex+"，电话为："+phone+"，身份证为："+idcard;
            Date date = new Date();
            String dataForm = new SimpleDateFormat("yyyy-MM-dd").format(date);
            File file=new File("..\\"+dataForm+".txt");
            if(!file.exists())
                file.createNewFile();
            OutputStream outputStream = new FileOutputStream(file);
            byte[] bs = log.getBytes();
            outputStream.write(bs);
            outputStream.close();
            return "插入了"+row+"条数据，"+log;
        }
        return "插入失败已有相同用户存在";
    }
}
