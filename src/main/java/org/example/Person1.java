package org.example;

public abstract class Person1 {

    String name;
    int age;
    String sex;

    public Person1(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;

    }

    protected abstract void exam();

    public abstract void study();

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
