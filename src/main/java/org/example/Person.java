package org.example;


public class Person {
    String name="name的默认值";
    String sex="sex的默认值";
    static String info;

    {
        System.out.println("我是代码块");   //代码块中的内容会在对象创建时仅执行一次
    }


    // 构造方法会在对象创建时执行，我们可以将各种需要初始化的操作都在这里进行处理
      // 无参的构造方法
//    Person(){}
//
//    Person(){
//        name="11";
//        sex="man";
//    }

    // 有参的构造方法，覆盖原有的构造方法
    Person(String name,String sex){
        System.out.println(name);
        System.out.println(sex);
        System.out.println("我被构造了");
        this.name=name;
        this.sex=sex;
    }

    int sum(int a,int b){
        int c=a+b;
        return c;
    }

    double sum(double a,double b){
        return a+b;
    }

//    // 仅返回类型不同，形参相同，这样是错误的！
//    double sum(int a,int b){
//        return a+b;
//    }

//    // return返回值与方法定义不匹配
//    int sum(double a,double b){
//        return a+b;
//    }

    // 方法内的参数与类的属性重名
    void setName(String name){
//        name=name;
        this.name=name;
    }

    String getName(){
        return name;
    }


}