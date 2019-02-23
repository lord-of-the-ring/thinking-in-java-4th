package preview.P185_NestingInterface;

public class A {
    interface B{
        void f();
    }
    public class BImp implements B{
        public void f(){}
    }
    private class BImp2 implements B{
        public void f(){}
    }
    public interface C{
        void f();
    }
    class CImp implements C{
        public void f(){}
    }
    private class CImp2 implements C{
        public void f(){}
    }
    private interface D{
        void f();
    }
    private class DImp implements D{
        public void f(){}
    }
    public class DImp2 implements D{
        public void f(){}
    }
    public D getD(){return new DImp2();}
    private D dRef;
    public void receiveD(D d){
        dRef = d;
        dRef.f();
    }
    public static void main(String[] args){
        A a = new A();
        A.D ad = a.getD();
        //A.DImp2 dImp2 = a.getD();
        a.getD().f();
        a.receiveD(a.getD());
    }
}
class B{
    public static void main(String[] args){
        A a = new A();
        //A.D ad = a.getD();
        ////A.DImp2 dImp2 = a.getD();
        //a.getD().f();
        a.receiveD(a.getD());
    }
}
