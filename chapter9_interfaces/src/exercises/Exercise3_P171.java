package preview;

public class Exercise3_P171
{
    static abstract class Base{
        abstract void print();
        Base(){
            print();
        }
    }
    static class Derived extends Base{
        protected int cnt = 100;
        //static int cnt = 100;//注意此时cnt输出有一致性
        @Override  void print(){
            System.out.println("cnt = "+cnt);
        }
    }
    public static void main(String[] args){
        Derived derived = new Derived();
        derived.print();
    }
}
