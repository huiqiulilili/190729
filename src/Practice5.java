abstract class Person5{
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //抽象方法
    public abstract void getPersonInfo();
}

class Student5 extends Person5{
    public void getPersonInfo(){
        System.out.println("我是学生");
    }
}
    public class Practice5 {
        public static void main(String[] args) {
            Person5 per = new Student5();
            per.getPersonInfo();
        }
}
