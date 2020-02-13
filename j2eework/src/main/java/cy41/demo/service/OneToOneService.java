package cy41.demo.service;

import cy41.demo.dao.OneToOne;
import cy41.demo.eneity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OneToOneService {
    @Autowired
    private OneToOne oo;
    public Teacher getTeacher(int id){
        return oo.getTeacher(id);
    }
}
