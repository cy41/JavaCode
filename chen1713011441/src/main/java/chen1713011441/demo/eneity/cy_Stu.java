package chen1713011441.demo.eneity;

import org.apache.ibatis.type.Alias;

import java.util.List;
@Alias("cy_Stu")
public class cy_Stu {
    private int cy_stu_id;
    private String cy_stu_name;
    private String cy_stu_origin;
    private List<cy_Course> list;

    public int getCy_stu_id() {
        return cy_stu_id;
    }

    public void setCy_stu_id(int cy_stu_id) {
        this.cy_stu_id = cy_stu_id;
    }

    public String getCy_stu_name() {
        return cy_stu_name;
    }

    public void setCy_stu_name(String cy_stu_name) {
        this.cy_stu_name = cy_stu_name;
    }

    public String getCy_stu_origin() {
        return cy_stu_origin;
    }

    public void setCy_stu_origin(String cy_stu_origin) {
        this.cy_stu_origin = cy_stu_origin;
    }

    public List<cy_Course> getList() {
        return list;
    }

    public void setList(List<cy_Course> list) {
        this.list = list;
    }
}
