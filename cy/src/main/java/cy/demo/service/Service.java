package cy.demo.service;

import cy.demo.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Dao dao;
    public int insert(String name,
                      String sex,
                      String phone,
                      String idcard){
        return dao.insert(name,sex,phone,idcard);
    }
}
