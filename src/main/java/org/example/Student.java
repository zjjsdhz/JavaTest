package org.example;

public class Student extends Person3{

    String name;

    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void study(){
        test();
        System.out.println("i in student");
    }

    @Override
    public void test() {
        System.out.println("我是student的test方法");
    }
}
