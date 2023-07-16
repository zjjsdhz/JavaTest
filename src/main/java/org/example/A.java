package org.example;

public interface A {
//    boolean equals(Object object);
    default void test(){
        System.out.println("我是接口的test方法");
    };
}
