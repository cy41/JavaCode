package cy.demo.interceptor;

import cy.demo.configurer.MyConfigurer;
import cy.demo.entity.MyTest;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Mylnterceptor implements HandlerInterceptor {

    //处理器执行前方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("处理器前方法");
        return true;
    }

    //处理器处理后方法
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("处理器后方法");
        MyTest mt=new MyTest((String)request.getSession().getAttribute(MyConfigurer.SESSION_KEY_SEX), (String)request.getSession().getAttribute(MyConfigurer.SESSION_KEY_PHONE), (String)request.getSession().getAttribute(MyConfigurer.SESSION_KEY_IDCARD));
        String fail=mt.mytest();
        if(fail.equals("success")) request.getRequestDispatcher("/insertIntoTable").forward(request,response);
        else{
            HttpSession session=request.getSession();
            session.removeAttribute("name");
            session.removeAttribute("sex");
            session.removeAttribute("phone");
            session.removeAttribute("idcard");
            System.out.println(fail);
            request.getRequestDispatcher("/insertform").forward(request,response);
        }
    }

    //处理器完成后方法
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("处理器完成方法");
    }
}
