package preview.P187_Factories;

import jdk.internal.dynalink.linker.LinkerServices;

interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}
class Implementation1 implements Service{
    Implementation1(){}//package access
    public void method1(){System.out.println("Implementation1.method1()");}
    public void method2(){System.out.println("Implementation1.method2()");}
}
class Implementation1_Factory implements ServiceFactory{
    public Service getService(){
        return new Implementation1();
    }
}
class Implementation2 implements Service{
    Implementation2(){}//package access
    public void method1(){System.out.println("Implementation2.method1()");}
    public void method2(){System.out.println("Implementation2.method2()");}
}
class Implementation2_Factory implements ServiceFactory{
    public Service getService(){
        return new Implementation2();
    }
}
public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service service = fact.getService();//是一个implementation 对象
        service.method1();
        service.method2();
    }
    public static void main(String[] args){
        serviceConsumer(new Implementation1_Factory());
        serviceConsumer(new Implementation2_Factory());
        new Implementation1().method1();
        new Implementation1().method2();
        new Implementation2().method1();
        new Implementation2().method2();
    }
}
