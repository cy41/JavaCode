package testaop.intercept;

import testaop.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

public interface Interceptor {
    //事前;
    public boolean before();
    //事后;
    public void after();

    /*
    *取代原有方法
    *@param invocation --回调参数，通过其proceed方法，回调原方法;
    *@return 原有事件的对象
    *
    * */
    public Object around(Invocation invocation)
            throws InvocationTargetException,IllegalAccessException;

    //无异常执行;
    public void afterReturning();

    //异常执行;
    public void afterThrowing();

    //是否用around取代原方法;
    public boolean useAround();
}
