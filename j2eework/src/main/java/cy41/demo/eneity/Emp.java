package cy41.demo.eneity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("Emp")
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private Date hiredata;
    private double sal;
    private double comm;
    private int deptno;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHiredata() {
        return hiredata;
    }

    public void setHiredata(Date hiredata) {
        this.hiredata = hiredata;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int depno) {
        this.deptno = depno;
    }
}
