package exercises.Exercise16_P183;

import java.util.Random;

public class RandomChar {
    private static Random rand = new Random(47);
    private final String alpha = "abcdefghijklmnopqrstuvwxyz";
    private final String num = "1234567890";
    private final int length = 10;
    private final char[] str = (alpha+alpha.toUpperCase()+num).toCharArray();
    char[] next(){
        char[] ans = new char[length];
        for(int i = 0; i < 10; ++i){
            ans[i] = str[rand.nextInt(str.length)];
        }
        return ans;
    }
    public static void main(String[] args){
        RandomChar randomChar = new RandomChar();
        for(int i = 0; i < 7; ++i){
            System.out.println(randomChar.next());
        }
    }
}
