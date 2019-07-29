class Person4{
    public void print(){
        System.out.println("我是人类");
    }
}

class Student4 extends Person4{
    public void print(){
        System.out.println("我是学生");
    }
}

class Worker extends Person4{
    public void print(){
        System.out.println("我是工人");
    }
}
public class Practice4 {
    public static void main(String[] args) {
        whoYouAre(new Student4());
        whoYouAre(new Worker());
    }
    public static void whoYouAre(Person4 per){
        per.print();
    }
}
