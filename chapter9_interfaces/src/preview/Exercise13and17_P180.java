package preview;

public class Exercise13and17_P180
{
    interface test1{
        int x1 = 1;
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
    static class class_1 implements test1{
        @Override public void t1(){
            System.out.println(x1);
        }
    }
}
