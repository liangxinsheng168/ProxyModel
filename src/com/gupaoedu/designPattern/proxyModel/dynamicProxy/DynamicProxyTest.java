package com.gupaoedu.designPattern.proxyModel.dynamicProxy;

import com.gupaoedu.designPattern.proxyModel.Person;
import com.gupaoedu.designPattern.proxyModel.Student;

public class DynamicProxyTest {

    public static void main(String[] args) {
        DynamicMonitor monitor = new DynamicMonitor();
        Person person = monitor.getProxyInstance(new Student("Tony"));
        person.donateMoney(15000);
    }

}
