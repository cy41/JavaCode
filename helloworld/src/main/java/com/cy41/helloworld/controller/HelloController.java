package com.cy41.helloworld.controller;

import com.cy41.helloworld.myservice.UserService;
import com.cy41.helloworld.myuse.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    UserService us;
    @RequestMapping("/hello")
    @ResponseBody
    public List<User> hello(){
        return us.findAll();
    }

    @GetMapping("/menu")
    public String menu(){
        return "/file/menu";
    }

    /*
    * 通过?id=123的传值方法查询;
    * */
    @GetMapping("/showUser")
    public ModelAndView showUser(String id,ModelAndView mv){
        System.out.println(id);
        User user=us.findById(id);
        if(user==null){
            mv.setViewName("file/fail");
        }
        else{
            mv.addObject("user",user);
            mv.setViewName("/file/showUser");
        }
        return mv;
    }

    /*
    * 根据id查询用户;
    * */
    @GetMapping("/select")
    public String ask(){
        return "/file/select";
    }
    /*
    * 显示查询结果;
    * */
    @PostMapping("/selectPost")
    public ModelAndView mav(@RequestParam("id") String id,ModelAndView mv){
        System.out.print(id);
        User user=us.findById(id);
        if(user==null){
            mv.setViewName("/file/fail");
        }
        else{
            mv.addObject("user",user);
            mv.setViewName("/file/showUser");
        }
        return mv;
    }

    /*
    * 增加用户;
    * */
    @GetMapping("/insert")
    public String insert(){
        return "/file/insert";
    }

    /*
    * 增加用户，若成功则跳转到展示页，否则跳转到失败页;
    * */
    @PostMapping("/insert")
    public ModelAndView insert(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("age") String age){
        User user=new User(id,age,name);
        ModelAndView mv=new ModelAndView();
        if(us.insert(user)){
            mv.addObject("user",user);
            mv.setViewName("/file/showUser");
            return mv;
        }
        mv.setViewName("/file/fail");
        return mv;
    }

    /*
    * 根据id删除用户;
    * */
    @GetMapping("/delete")
    public String delete(){
        return "/file/delete";
    }

    /*
    * 删除成功则跳转，否则失败页;
    * */
    @PostMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam("id") String id){
        if(us.delById(id)){
            return "success";
        }
        return "fail";
    }
}
