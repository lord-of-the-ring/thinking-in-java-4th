package preview;
import preview.P177_Interfacepro_Apply.*;
public class Exercise11_P178
{
    static class Test11{//如果用它直接implement就是不含委托模式
        String get_name(){return this.getClass().getSimpleName();};
        String process(String str){
            //String str = (String) input;
            char[] cha = str.toCharArray();
            for(int i = 1; i < cha.length; i = i+2){
                char tmp = cha[i];
                //str.charAt(i) = str.charAt(i-1);
                cha[i] = cha[i-1];
                cha[i-1] = tmp;
                //System.out.println(tmp);
            }
            //return new String(cha);
            return String.valueOf(cha);
        };
    }
    static class Test11_Adapter implements P177_Interfacepro_Apply.Processor{//借鸡生蛋，适配器模式
        private Test11 test11;//其他接口的一个对象，委托模式
        Test11_Adapter(Test11 test11){
            this.test11 = test11;
        }
        @Override public String name(){return test11.get_name();};
        @Override public Object process(Object input){return test11.process((String)input);};
    }
    public static void main(String[] args){
        String str = "12121";
        P177_Interfacepro_Apply.process(new Test11_Adapter(new Test11()),str);
    }
}
