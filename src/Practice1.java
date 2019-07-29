class Person{

    public String info = "爸爸";
//    public void print(){
//        System.out.println("father");
//    }


}

class Student extends Person{

    public String info = "儿子";
    public void print(){

        System.out.println(super.info);
        System.out.println(this.info);
//        super.print();
//        System.out.println("Student");
    }
}
public class Practice1 {
    public static void main(String[] args) {
        new Student().print();

    }
}
