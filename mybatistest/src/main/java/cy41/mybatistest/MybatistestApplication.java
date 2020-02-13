package cy41.mybatistest;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.sql.DataSource;


@SpringBootApplication
@MapperScan("cy41.mybatistest.dao")
public class MybatistestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatistestApplication.class, args);
    }

}
