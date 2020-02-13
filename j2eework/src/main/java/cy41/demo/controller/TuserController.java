package cy41.demo.controller;

import cy41.demo.eneity.Tuser;
import cy41.demo.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TuserController {
    @Autowired
    private TuserService ts;

    @GetMapping("/getTUser")
    @ResponseBody
    public Tuser getTUser(@RequestParam(value = "id",required = true) int id,
                          @RequestParam(value = "userName",required = false) String userName,
                          @RequestParam(value = "note",required = false) String note){
        return ts.getTUser(id,userName,note);
    }
}
