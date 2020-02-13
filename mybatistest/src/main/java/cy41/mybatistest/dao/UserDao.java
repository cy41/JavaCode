package cy41.mybatistest.dao;

import cy41.mybatistest.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.*;

@Mapper
@Repository
public interface UserDao {
    public int insert(User user);
    public boolean deleteById(String id);
    public int deleteAll();
    public int upd(User user);
    public User getUserById(String id);
    public List<User> getAll();
}
