package cy.demo.entity;

import cy.demo.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;

public class MyTest {
    private String sex;
    private String phone;
    private String idcard;
    public MyTest(String sex, String phone, String idcard) {
        this.sex = sex;
        this.phone = phone;
        this.idcard = idcard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String mytest(){
        if(sex.equals("")||sex==null||phone.equals("")||phone==null||idcard.equals("")||idcard==null) return "null";
        if(!(sex.equals("男")||sex.equals("女"))) return "pleace check your sex!!";
        if(phone.length()!=11) return "phone's length was wrong!!";
        if(idcard.length()!=18) return "idcard's length was wrong!!";
        for(int i=0;i<phone.length();++i)
            if(!(phone.charAt(i)>='0'&&phone.charAt(i)<='9')) return "please check your phone!!";
        for(int i=0;i<idcard.length()-1;++i)
            if(!(idcard.charAt(i)>='0'&&idcard.charAt(i)<='9')) return "please check your idacrd!!";
        char x=idcard.charAt(idcard.length()-1);
        if(!((x>='0'&&x<='9')||x=='x'||x=='X')) return "idcard's last charter was wrong!!";
        int val=0;
        for(int i=14;i<17;++i)
            val=val*10+idcard.charAt(i)-'0';
        int t=val%2;
        if((t==1&&sex.equals("女"))||(t==0&&sex.equals("男")))
            return "please check your sex and idcard!!";
        return "success";
    }
}
