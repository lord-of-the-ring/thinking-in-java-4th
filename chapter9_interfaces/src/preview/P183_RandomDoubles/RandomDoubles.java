package preview.P183_RandomDoubles;
import java.util.Random;

public class RandomDoubles
{
    private static Random rand = new Random(47);
    double next(){return rand.nextDouble();}
    public static void main(String[] args){
        RandomDoubles randomDoubles = new RandomDoubles();
        for(int i = 0; i < 7;++i){
            System.out.println(randomDoubles.next());
        }
    }
}
