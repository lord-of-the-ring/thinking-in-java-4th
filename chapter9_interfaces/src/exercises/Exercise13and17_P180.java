package exercises;

public class Exercise13and17_P180
{
    interface test1{
        int x1 = 1;//接口中的域隐式地是static和final的
        void t1();
    }
    interface test2 extends test1{
        void t2();
    }
    interface test3 extends test1{
        void t3();
    }
    interface test4 extends test2,test3{
        void t4();
    }
    static class Class_1 implements test1{
        static int x2 = 20;
        @Override public void t1(){
            System.out.println(x1);
            //System.out.println(++x1);
            System.out.println(++x2);
        }
    }
    public static void main(String[] args){
        Class_1 class_1 = new Class_1();
        class_1.t1();
        class_1.t1();//注意变化

    }
}
