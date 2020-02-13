package cy41.demo.eneity;

import org.apache.ibatis.type.Alias;

@Alias("Teacher")
public class Teacher {
    private int tId;
    private String tName;
    private Cclass clas;

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Cclass getClas() {
        return clas;
    }

    public void setClas(Cclass clas) {
        this.clas = clas;
    }
}
