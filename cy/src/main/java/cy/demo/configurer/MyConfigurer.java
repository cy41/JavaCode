package cy.demo.configurer;

import cy.demo.interceptor.Mylnterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfigurer implements WebMvcConfigurer {
    public final static String SESSION_KEY_NAME = "name";
    public final static String SESSION_KEY_SEX = "sex";
    public final static String SESSION_KEY_PHONE = "phone";
    public final static String SESSION_KEY_IDCARD = "idcard";
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration mi=registry.addInterceptor(new Mylnterceptor());
        mi.addPathPatterns("/hhh");

    }
}
