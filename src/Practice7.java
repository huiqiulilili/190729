abstract class Person7{
    private String name;

    public Person7(){
        System.out.println("******************");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void getPersonInfo();

}

class Student7 extends Person7{

    @Override
    public void getPersonInfo() {
        //空实现
    }

    public Student7(){
        System.out.println("======================");
    }
}
public class Practice7 {
    public static void main(String[] args) {
        new Student7();
    }
}
