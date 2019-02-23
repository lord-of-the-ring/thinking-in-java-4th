package preview;

public class Exercise4_P172
{
    static abstract class Class_4_1a{
    }
    static class Class_4_1b extends Class_4_1a{
        static void Hello(){
            System.out.println("Hello 1");
        }
    }
    static void test1(Class_4_1a class_4_1a){
        ((Class_4_1b)class_4_1a).Hello();
        //class_4_1a.Hello();
    }

    static abstract class Class_4_2a{
        abstract void Hello();
    }
    static class Class_4_2b extends Class_4_2a{
        void Hello(){
            System.out.println("Hello 2");
        }
    }
    static void test2(Class_4_2a class_4_2a){
        class_4_2a.Hello();
    }
    public static void main(String[] args){
        Class_4_1a class_4_1a = new Class_4_1b();
        Class_4_2a class_4_2a = new Class_4_2b();
        test1(class_4_1a);
        test2(class_4_2a);
    }
}
