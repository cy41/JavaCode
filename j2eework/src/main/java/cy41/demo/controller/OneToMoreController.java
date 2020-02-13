package cy41.demo.controller;

import cy41.demo.eneity.Dept;
import cy41.demo.eneity.Emp;
import cy41.demo.service.OneToMoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OneToMoreController {
    @Autowired
    private OneToMoreService os;

    @GetMapping("/getAllEmp/{id}")
    @ResponseBody
    public Dept getAllEmp(@PathVariable("id") int id){
        return os.getAllEmp(id);
    }

    @GetMapping("/getDept/{id}")
    @ResponseBody
    public Emp getDept(@PathVariable("id") int id){
        return os.getDept(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Dept> getAll(){
        return os.getAll();
    }
}
