package cy41.demo.dao;

import cy41.demo.eneity.Tuser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TuserDao {

    public Tuser getTUser(int id,
                          String userName,
                          String note);

}
