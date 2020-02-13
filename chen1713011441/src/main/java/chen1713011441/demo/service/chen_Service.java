package chen1713011441.demo.service;

import chen1713011441.demo.dao.Cy_Dao;
import chen1713011441.demo.eneity.cy_Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class chen_Service {
    @Autowired
    private Cy_Dao cd;
    public int insert(cy_Stu cs){
        return cd.insert(cs);
    }
    public cy_Stu select(int id){
        return cd.select(id);
    }
}
