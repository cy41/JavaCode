package cy41.demo.controller;

import cy41.demo.eneity.Teacher;
import cy41.demo.service.OneToOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OneToOneController {
    @Autowired
    private OneToOneService os;
    @GetMapping("getTeacher/{id}")
    @ResponseBody
    public Teacher getTeacher(@PathVariable("id") int id){
        return os.getTeacher(id);
    }
}
