package cy41.demo.eneity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;

@Alias("Tuser")
public class Tuser {
    private int id;
    private String userName;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
