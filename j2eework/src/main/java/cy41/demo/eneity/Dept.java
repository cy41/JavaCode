package cy41.demo.eneity;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("Dept")
public class Dept {
    private int deptno;
    private String dname;
    private String loc;
    private List<Emp> list;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Emp> getList() {
        return list;
    }

    public void setList(List<Emp> list) {
        this.list = list;
    }
}
