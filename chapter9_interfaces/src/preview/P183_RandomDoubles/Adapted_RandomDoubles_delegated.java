package preview.P183_RandomDoubles;

import java.util.Scanner;

public class Adapted_RandomDoubles_delegated implements Readable
{
    private RandomDoubles randomDoubles = new RandomDoubles();
    private int cnt;
    //Adapted_RandomDoubles_delegated(RandomDoubles randomDoubles, int cnt){
    Adapted_RandomDoubles_delegated(int cnt){
        //this.randomDoubles = randomDoubles;
        this.cnt = cnt;
    }
    double next(){return randomDoubles.next();}
    @Override public int read(java.nio.CharBuffer cb) {
        if (--cnt == -1) return -1;
        String tmp = String.valueOf((next()) + " ");
        cb.append(tmp);
        return tmp.length();
    }
    public static void main(String[] args){
        //Scanner scanner = new Scanner(new Adapted_RandomDoubles_delegated(new RandomDoubles(),7));
        Scanner scanner = new Scanner(new Adapted_RandomDoubles_delegated(7));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
