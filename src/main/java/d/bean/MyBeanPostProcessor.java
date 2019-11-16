package d.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 只需要这一个类，和所有的
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("前方法"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        System.out.println("后方法"+beanName);
        if (!"userServiceId".equals(beanName)){
            return bean;
        }
        //bean 目标对象
        //生成jdk代理
        return Proxy.newProxyInstance(
                MyBeanPostProcessor.class.getClassLoader(),
                bean.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("----开启事务");
                        //执行目标方法
                        Object obj = method.invoke(bean, args);
                        System.out.println("----提交事务");
                        return obj;
                    }
                }
        );
    }
}
