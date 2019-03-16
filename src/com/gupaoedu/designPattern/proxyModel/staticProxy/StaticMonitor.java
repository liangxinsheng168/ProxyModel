package com.gupaoedu.designPattern.proxyModel.staticProxy;

import com.gupaoedu.designPattern.proxyModel.Person;
import com.gupaoedu.designPattern.proxyModel.Student;

public class StaticMonitor implements Person {

    private Student student;

    public StaticMonitor(Student student) {

        this.student = student;

    }

    @Override
    public void donateMoney(int money) {

        System.out.println("Now, let us to donate money.");
        student.donateMoney(money);
        System.out.println("finished.");

    }
}
