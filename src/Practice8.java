abstract class A{
    public A(){
        this.print();
    }

    public abstract void print();
}

class B extends A{
    private int num = 100;

    public B(int num){
        this.num = num;
    }

    @Override
    public void print() {
        System.out.println(this.num);
    }
}
public class Practice8 {
    public static void main(String[] args) {
        new B(30);
    }
}