package preview;


import java.util.Arrays;

public class P175_Classpro_Apply
{
    static class Processor{
        public String name(){
            return getClass().getSimpleName();
        }
        Object process(Object input){return input;}
    }
    static class Upcase extends Processor{
        String process(Object input){//很明显是协同转换了，covariant
            return ((String)input).toUpperCase();
        }
    }
    static class Downcase extends Processor{
        String process(Object input){
            return ((String)input).toLowerCase();
        }
    }
    static class Splitter extends Processor{
        String process(Object input){
            return Arrays.toString(((String)input).split(" "));
        }
    }
    public static void process(Processor processor, Object object){
        System.out.println("Using Processor "+processor.name());
        System.out.println(processor.process(object));
    }
    public static String str = "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args){
        process(new Upcase(),str);
        process(new Downcase(),str);
        process(new Splitter(),str);
    }
}
