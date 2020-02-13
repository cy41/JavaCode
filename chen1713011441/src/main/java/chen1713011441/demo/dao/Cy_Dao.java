package chen1713011441.demo.dao;

import chen1713011441.demo.eneity.cy_Stu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Cy_Dao {
    public int insert(cy_Stu cs);

    public cy_Stu select(int id);
}
