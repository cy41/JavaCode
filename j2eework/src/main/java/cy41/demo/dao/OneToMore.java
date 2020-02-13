package cy41.demo.dao;

import cy41.demo.eneity.Dept;
import cy41.demo.eneity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OneToMore {
    public Dept getAllEmp(int id); //获取部门所有员工;
    public Emp getDept(int id); //获取员工所在部门;
    public List<Dept> getAll();//获取所有部门的所有员工;
}
