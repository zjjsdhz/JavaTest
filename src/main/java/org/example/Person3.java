package org.example;

public class Person3 {
    String name;
    private int age;
    private String sex;

    public Person3(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        if(name.contains("小")) return;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void test(){
        System.out.println("我是Person3的test方法");
    }



    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    //    @Override //表示该方法是重写的
//    public boolean equals(Object obj) {
//        if(obj == null) return false;
//        if(obj instanceof Person3){
//            Person3 person3=(Person3) obj;
//            return this.name.equals(person3.name)&&
//                    this.age == person3.age &&
//                    this.sex.equals(person3.sex);
//        }
//        return false;
//    }
}
