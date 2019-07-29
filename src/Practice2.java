class Person2{
    public void print(){
        System.out.println("爸爸");
    }
}

class Student2 extends Person2{
    public void print(){
        System.out.println("儿子");
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Person2 person = new Student2();
        person.print();
    }
}
