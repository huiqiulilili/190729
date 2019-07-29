abstract class Person6{
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void getPersonInfo();

    public static Person6 getInstance(){
        class Student6 extends Person6{
            public void getPersonInfo(){
                System.out.println("我是学生");
            }
        }
        return new Student6();
    }
}


public class Practice6 {
    public static void main(String[] args) {
        Person6 per = Person6.getInstance();
        per.getPersonInfo();
    }
}