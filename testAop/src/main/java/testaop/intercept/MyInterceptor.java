package testaop.intercept;

import testaop.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

public class MyInterceptor implements Interceptor{
    @Override
    public boolean before() {
        System.out.println("this is before");
        return true;
    }

    @Override
    public void after() {
        System.out.println("this is after");
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("before around");
        Object obj=invocation.proceed();
        System.out.println("after around");
        return obj;
    }

    @Override
    public void afterReturning() {
        System.out.println("this is afterReturning");
    }

    @Override
    public void afterThrowing() {
        System.out.println("this is afterThrowing");
    }

    @Override
    public boolean useAround() {
        return false;
    }
}
