package preview;

public class Exercise8_P174
{
    interface FastFood{
        String toString();
    }
    static class Meal implements FastFood{
        Meal(){System.out.println("Meal()");}
        @Override public String toString(){return "Meal";}
    }
    static class Bread implements FastFood{

        @Override public String toString(){return "Bread";}
    }
    static class Cheese implements FastFood{
        @Override public String toString(){return "Cheese";}
    }
    static class Lettuce implements FastFood{
        @Override public String toString(){return "Lettuce";}
    }
    static class Lunch extends Meal{
        @Override public String toString(){return "Meal";}
    }
}
