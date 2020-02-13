package testaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import testaop.entity.Hello;
import testaop.entity.Helloimpl;
import testaop.intercept.MyInterceptor;
import testaop.proxy.ProxyBean;

@SpringBootApplication
public class TestAopApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestAopApplication.class, args);
        Hello hello=new Helloimpl();
        Hello proxy= (Hello)ProxyBean.getProxyBean(hello,new MyInterceptor());
        proxy.sayhello("cy",5);
        System.out.println("------------------");
        proxy.sayhello(null,5);
    }

}
