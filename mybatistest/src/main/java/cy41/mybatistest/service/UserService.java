package cy41.mybatistest.service;

import cy41.mybatistest.dao.UserDao;
import cy41.mybatistest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao ud;

    public User getUserById(String id){
        return ud.getUserById(id);
    }

    public int insert(User user){
        return ud.insert(user);
    }

    public boolean deleteById(String id){
        return ud.deleteById(id);
    }

    public int deleteAll(){
        return ud.deleteAll();
    }
    public List<User> getAll(){
        return ud.getAll();
    }
    public int upd(User user){
        return ud.upd(user);
    }
}
