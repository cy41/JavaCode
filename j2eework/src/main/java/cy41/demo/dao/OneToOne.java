package cy41.demo.dao;

import cy41.demo.eneity.Cclass;
import cy41.demo.eneity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OneToOne {
    public Teacher getTeacher(int id);
}
