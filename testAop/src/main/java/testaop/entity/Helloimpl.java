package testaop.entity;

public class Helloimpl implements Hello{
    @Override
    public void sayhello(String name,int x){
        if(name==null||name.trim()=="")
            throw new RuntimeException("error");
        System.out.println("hello "+name+" "+x);
    }
}
