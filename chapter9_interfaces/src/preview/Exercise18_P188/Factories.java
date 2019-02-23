package preview.Exercise18_P188;
interface Cycle{
    void wheels();
}
interface Cycle_Factory{
    Cycle getCycle(int cnt);
}
class Unicycle implements Cycle{
    public void wheels(){
        System.out.println("One wheel");
    }
}
class Bicycle implements Cycle{
    public void wheels(){
        System.out.println("Two wheels");
    }
}
class Tricycle implements Cycle{
    public void wheels(){
        System.out.println("Three wheels");
    }
}
class Factory implements Cycle_Factory {
    public Cycle getCycle(int cnt) {
        switch (cnt) {
            default:
            case 1:
                return new Unicycle();
            case 2:
                return new Bicycle();
            case 3:
                return new Tricycle();
            //default:System.out.println("Error!");break;
        }
    }
}
public class Factories{
    public static void ridding(Cycle_Factory cycle_factory){
        Cycle cycle;
        for(int i = 0; i < 4; ++i){
            cycle = cycle_factory.getCycle(i);
            cycle.wheels();
        }

    }
    public static void main(String[] args){
        ridding(new Factory());
        Factory factory = new Factory();
        for(int i = 3; i >= 0; --i){
            factory.getCycle(i).wheels();
            new Factory().getCycle(i).wheels();
        }
    }
}
