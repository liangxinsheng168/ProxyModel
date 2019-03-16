package com.gupaoedu.designPattern.proxyModel.staticProxy;

import com.gupaoedu.designPattern.proxyModel.Student;

public class StaticProxyTest {

    public static void main(String[] args) {

        Student student = new Student("Tony");
        StaticMonitor monitor = new StaticMonitor(student);
        monitor.donateMoney(100);

    }

}
