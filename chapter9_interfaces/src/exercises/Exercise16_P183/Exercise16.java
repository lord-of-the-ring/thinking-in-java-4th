package exercises.Exercise16_P183;

import java.util.Scanner;

public class Exercise16 extends RandomChar implements Readable {
    private int cnt;
    Exercise16(int cnt){this.cnt = cnt;};
    @Override public int read(java.nio.CharBuffer cb){
        if(--cnt == -1) return -1;
        cb.append(String.valueOf(next())+" ");
        return next().length+1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(new Exercise16(10));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
