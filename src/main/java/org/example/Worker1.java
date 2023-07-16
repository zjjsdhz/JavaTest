package org.example;

public abstract class Worker1 extends Person1 implements Study{
    public Worker1(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void study(){
        System.out.println("我是工人，我没有学生会学习！");
    }

}
