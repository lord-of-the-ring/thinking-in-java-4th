package exercises;
import preview2.Exercise5_P174.*;
public class Exercise5_P174
{
    static class Test5_2 implements Test5{
        public void func1(){System.out.println("Func1.()");}
        public void func2(){System.out.println("Func2.()");}
        public void func3(){System.out.println("Func3.()");}
    }
    public static void main(String[] args){
        Test5_2 test5_2 = new Test5_2();
        test5_2.func1();
        test5_2.func2();
        test5_2.func3();
    }
}
