package myspringboot.demo;

public class Test1 {
    public static void main(String[] args) {
        new Test1().show();
    }

    public void show(){
        System.out.println("======");
        show2();
    }

    public void show2(){
        int t = 1/0;
        System.out.println(t);
    }
}
