package exercises.Exercise16_P183;

public class RandomChar_v2 {
    private char getChar(char cha1, char cha2){
        return (char)(cha1+(cha2-cha1+1)*Math.random());//左取整
    }
    protected char getRandomChar(){
        return getChar('\u0100','\u1900');
    }
    public static void main(String[] args){
        RandomChar_v2 randomChar_v2 = new RandomChar_v2();
        for(int i = 0; i <10; ++i){
            System.out.println(randomChar_v2.getRandomChar());
        }
    }
}
