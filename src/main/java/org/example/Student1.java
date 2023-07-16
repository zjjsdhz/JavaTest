package org.example;

public class Student1 extends Person1 implements Study,Cloneable{
    public Student1(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void exam() {
        System.out.println("我是Student1的exam方法！");

    }

    @Override
    public void study() {
        System.out.println("我是Student1的study方法");

    }

    @Override
    public void learn() {

    }

    @Override
    public void test11() {
//        Study.super.test11();
        System.out.println("我是Student1重写的test11方法");
    }

    @Override
    public void sing() {

    }
}
