package geeksForGeeks.Arrays.tree;

public class Demo {

    int a=20;

    void d(int a){
        this.a=a;
    }


    public static void main(String[] args) {
        Demo d=new Demo();
        d.d(2);
        Demo b=d;

        System.out.println(b.a);
    }




}
