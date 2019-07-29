class Person3{
    public void print(){
        System.out.println("爸爸");
    }
}

class Student3 extends Person3{
    public void print(){
        System.out.println("儿子");
    }

    public void fun(){
        System.out.println("只有儿子");
    }
}
public class Practice3 {
    public static void main(String[] args) {
        Person3 per = new Student3();
//        per.print();
//
//        Student3 stu = (Student3) per;
//        stu.fun();
        System.out.println(per instanceof Person3);
        System.out.println(per instanceof Student3);
        if(per instanceof Student3){
            Student3 stu = (Student3) per;
            stu.fun();
        }
    }
}
