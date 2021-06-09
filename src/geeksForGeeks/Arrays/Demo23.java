package geeksForGeeks.Arrays;

public class Demo23 {
    public void ques3() {
        q3a(null);
    }
    public void q3a(String s) {
        System.out.println("1");
    }
    public void q3a(Object s) {
        System.out.println("2");
    }

    public void ques1() {
        String s1 = new String("abc");
        String s2 = new String("abc");
        if(s1 == s2) {
            System.out.println("1");
        }
        if(s1.hashCode() == s2.hashCode()) {
            System.out.println("2");
        }
        if(s1.equals(s2)) {
            System.out.println("3");
        }
    }
    public static void main(String[] args) {

       Demo23 demo23=new Demo23();
       demo23.ques1();
    }
}

class A{
    A(){
        System.out.println("a");
    }
    public void run() {
        System.out.println("a run");
    }
}

class B extends A{
    B(){
        System.out.println("b");
    }
    public void run() {
        System.out.println("b run");
    }
}

class C extends B{
    C(){
        System.out.println("c");
    }
    public void run() {
        System.out.println("c run");
    }
}
