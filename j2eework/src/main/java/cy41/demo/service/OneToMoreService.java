package cy41.demo.service;

import cy41.demo.dao.OneToMore;
import cy41.demo.eneity.Dept;
import cy41.demo.eneity.Emp;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneToMoreService {
    @Autowired
    private OneToMore om;
    public Dept getAllEmp(int id){
        return om.getAllEmp(id);
    }
    public Emp getDept(int id){
        return om.getDept(id);
    }
    public List<Dept> getAll(){
        return om.getAll();
    }
}
