package preview;

import java.util.Arrays;

public class P177_Interfacepro_Apply
{
    public static interface Processor{// 2019/02/26，我把exercise11挎包转移了
        String name();
        Object process(Object input);
    }
    public static void process(Processor processor, Object object){
        System.out.println("Using Processor "+processor.name());
        System.out.println(processor.process(object));
    }
    static abstract class StringProcessor implements Processor{//里面implement的必须都是public
        /////////////////////////////////////////
        public String name(){
            return this.getClass().getSimpleName();
        }
        public abstract String process(Object input);
        /////////////////////////////////////////
        static String str = "If she weighs the same as a duck, she's made of wood";
        public static void main(String[] args){
            P177_Interfacepro_Apply.process(new Upcase(),str);
            P177_Interfacepro_Apply.process(new Downcase(),str);
            P177_Interfacepro_Apply.process(new Splitter(),str);

        }
    }
    static class Upcase extends StringProcessor{
        public String process(Object input){
            return ((String)input).toUpperCase();
        }
    }
    static class Downcase extends StringProcessor{
        public String process(Object input){
            return ((String)input).toLowerCase();
        }
    }
    static class Splitter extends StringProcessor{
        public String process(Object input){
            return Arrays.toString(((String)input).split(" "));
        }
    }/*
    static String str = "If she weighs the same as a duck, she's made of wood";
    public static void main(String[] args){
        process(new Upcase(),str);
        process(new Downcase(),str);
        process(new Splitter(),str);
    }
    */
}
