package cy.demo.dao;

import cy.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Dao {
    public int insert(String name,
                      String sex,
                      String phone,
                      String idcard);
    public User select(String phone,String idcard);
}
