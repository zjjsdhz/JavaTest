package org.example;

public class Worker extends Person3{

    String name;


    public Worker(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void work(){
        System.out.println("I am"+name+"I am working"); // Worker的name属性
        System.out.println(super.name); // 父类的name属性
        System.out.println("ii"+this.name); // Worker的name属性
    }

    @Override
    public void test() {
        System.out.println("我是Worker的test方法！");
        super.test();
    }
}
