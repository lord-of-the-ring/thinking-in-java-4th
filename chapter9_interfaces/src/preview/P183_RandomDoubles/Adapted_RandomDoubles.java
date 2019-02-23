package preview.P183_RandomDoubles;

import java.util.Scanner;

public class Adapted_RandomDoubles extends RandomDoubles implements Readable
{
    private int cnt;
    Adapted_RandomDoubles(int cnt){this.cnt = cnt;}
    @Override public int read(java.nio.CharBuffer cb){
        if(--cnt == -1) return -1;
        /*char[] db = String.valueOf(new RandomDoubles().next()).toCharArray();
        for(int i = 0; i < db.length; ++i){
            cb.append(db[i]);
        }
        cb.append(" ");
        return db.length+1;
        */
        String tmp = String.valueOf((next())+" ");
        cb.append(tmp);
        return tmp.length();
    }
    public static void main(String[] args){//静态方法没有覆盖
        //Adapted_RandomDoubles adapted_randomDoubles = new Adapted_RandomDoubles(3);
        Scanner scanner = new Scanner(new Adapted_RandomDoubles(3));
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
