package cy41.demo.service;

import cy41.demo.dao.TuserDao;
import cy41.demo.eneity.Tuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TuserService {
    @Autowired
    private TuserDao td;
    public Tuser getTUser(int id,
                          String userName,
                          String note){
        return td.getTUser(id,userName,note);
    }
}
