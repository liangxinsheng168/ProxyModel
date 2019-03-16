package com.gupaoedu.designPattern.proxyModel.dynamicProxy;

import com.gupaoedu.designPattern.proxyModel.Person;
import com.gupaoedu.designPattern.proxyModel.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicMonitor implements InvocationHandler {

    private Student student;

    public Person getProxyInstance(Student student) {

        this.student = student;
        Class clazz = this.student.getClass();
        return (Person)Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Now, let us to donate money.");
        Object object = method.invoke(this.student,args);
        System.out.println("finished");
        return object;
    }
}
