package org.example;

public interface Study extends Sing{

    public static final int a=10;

    public static void test22(){
        System.out.println("我是接口Study里的静态方法test22()");
    }

    public abstract void study(); //接口中只能有抽象方法
    void learn();

    default void test11(){
        System.out.println("我是默认实现方法");
    }
}
