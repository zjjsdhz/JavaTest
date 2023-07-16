package org.example;

/**
*  @since 2023。7。8
 *  @author zjj
* */

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个值：");
//        int num = sc.nextInt();

//        // 寻找水仙花数
//
//        for(int i=100;i<1000;i++){
//            int a=i/100;
//            int b=i/10%10;
//            int c=i%10;
//            if(i==(int)(Math.pow(a,3))+(int)(Math.pow(b,3))+(int)(Math.pow(c,3))){
//                System.out.println(i+"是水仙花数");
//
//            }
//        }
//        System.out.println("---------------------------------");
//
//        // 打印九九乘法表
//        for(int a=1;a<10;a++){
//            for(int b=1;b<=a;b++){
//                int sum=a*b;
//
//                System.out.print(a+"*"+b+"="+sum+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("---------------------------------");
//
//
//        // 斐波那契数列
//        int target = 7, result;  //target是要获取的数，result是结果//请在这里实现算法
//        int n1=1,n2=1,tmp;
//        for(int i=1;i<target;i++){
//            tmp=n1+n2;
//            n1=n2;
//            n2=tmp;
//        }
//        result=n1;
//        System.out.println(result);

        System.out.println("--------------------");

//        Person p1=new Person();
//        Person p2=p1;
//        System.out.println(p1==p2);
//
//        Person p3=new Person();
//        System.out.println(p1==p3);
//
//        p1.name="zeo";
//        p3.name="Tom";
//        System.out.println(p1.name);
//        System.out.println(p2.name);
//        System.out.println(p3.name);
//
//
////        // 空指针异常
////        Person p4=null;
////        p4.name="Joy";
////        System.out.println(p4.name);
//
//        Person p=new Person();
//        p.name="May";
//        p.sex="man";
//        int result=p.sum(10,20);
//        System.out.println(result);
//
//        Person p4=new Person();
//        p4.setName("111");
//        System.out.println(p4.name);
//        System.out.println(p4.getName());
//
//        System.out.println(p.sum(10,40));
//        System.out.println(p.sum(10.1,40)); // 报异常，不兼容的类型: 从double转换到int可能会有损失

        Person p =new Person("Tom","man");
        System.out.println(p.name);
        System.out.println(p.sex);
        Person p1=new Person("Tom1","man");


        Phone pp=new Phone();
        Phone pp1=new Phone();
        pp.size="big";
        Phone.size="small";
        System.out.println(pp1.size);

        Person3 person3=new Person3("Tom",18,"man");
        person3.setName("大明");
        System.out.println(person3.getName()+person3.getAge()+person3.getSex());

        System.out.println("------------------");

        Student student=new Student("tom student",11,"woman");
        student.study();

        Worker worker=new Worker("小明",11,"man");
        worker.work();
        worker.test();

        Person3 person31=new Person3("tmm",11,"man");
        Person3 person32=new Person3("tmm",11,"man");
        System.out.println(person31.equals(person32));
        System.out.println(person31 );
        person31.toString();

//        Person1 person1=new Person1(); // 抽象方法不能实例化，不能通过new来创建对象，但可以new他的子类
        Person1 person1=new Student1("tom11",22,"man");
        person1.exam();


        System.out.println("----------");
        Study study=new Student1("aa",11,"man");
        study.study();
        study.test11();
//        if(study instanceof Student1){
//            Student1 student2=(Student1) study;
//            student2.study();
//        }

        Student1 student3=new Student1("qqq",18,"man");
        Student1 clone= (Student1) student3.clone();
        System.out.println(student3.equals(clone));

        System.out.println("--------------");

        Test2 test2=new Test2();
        test2.test();

        System.out.println("-----------------");

        Student2 student22=new Student2();
        student22.setStatus(Status.RUNNING);
        System.out.println(student22.getStatus());
        Status status=Status.valueOf("RUNNING");
        System.out.println(status);
//        Status status1=Status.valueOf("XXXX");
//        System.out.println(status1);

        Student2 student33=new Student2();
        student33.setStatus(Status.STUDY);
        System.out.println(student33.getStatus().getName());
        System.out.println(student33.getStatus());

        System.out.println("-----------------");
        System.out.println("commit2");

        System.out.println("我在github上做了修改！");

        System.out.println("我在IDEA上做了修改，之后提交到远程分支！");








    }
}
