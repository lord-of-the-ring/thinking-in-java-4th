package preview;
import java.util.*;
//import java.nio.*;
public class P182_RandomWords implements Readable
{
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = String.valueOf(capitals).toLowerCase().toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int cnt;
    P182_RandomWords(int cnt){this.cnt = cnt;}
    @Override public int read(java.nio.CharBuffer cb){
        if(cnt-- == 0){return -1;}
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for(int i = 0; i < 4; ++i){
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;//暂时没太懂这个的作用
        //更新：就是每次的CharBuffer的长度
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(new P182_RandomWords(3));
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
