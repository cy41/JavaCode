package chen1713011441.demo.eneity;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("cy_Course")
public class cy_Course {
    private int cy_course_id;
    private String cy_course_name;

    private List<cy_Stu> list;

    public List<cy_Stu> getList() {
        return list;
    }

    public void setList(List<cy_Stu> list) {
        this.list = list;
    }

    public int getCy_course_id() {
        return cy_course_id;
    }

    public void setCy_course_id(int cy_course_id) {
        this.cy_course_id = cy_course_id;
    }

    public String getCy_course_name() {
        return cy_course_name;
    }

    public void setCy_course_name(String cy_course_name) {
        this.cy_course_name = cy_course_name;
    }
}
