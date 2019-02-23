package preview;

public class P170_Music4
{
    enum Note{MIDDLE_C, C_SHARP, B_FLAT,}
    static abstract class Instrument{//跟在abstract之后
        private int cnt;
        public abstract void play(Note note);
        public String what(){return "Instrument";}
        public abstract void adjust();
    }
    static class Wind extends Instrument{
        @Override public void play(Note note)
        {
            System.out.println("Wind.play() "+note);
        }
        @Override public String what(){return "Wind";}
        @Override public void adjust(){}
    }
    static class Percussion extends Instrument{
        @Override public void play(Note note)
        {
            System.out.println("Percussion.play() "+note);
        }
        @Override public String what(){return "Percussion";}
        @Override public void adjust(){}
    }
    static class Stringed extends Instrument{
        @Override public void play(Note note)
        {
            System.out.println("Stringed.play() "+note);
        }
        @Override public String what(){return "Stringed";}
        @Override public void adjust(){}
    }
    static class Woodwind extends Wind{
        @Override public void play(Note note)
        {
            System.out.println("Woodwind.play() "+note);
        }
        @Override public String what(){return "Woodwind";}
    }
    static class Brass extends Wind{
        @Override public void play(Note note)
        {
            System.out.println("Brass.play() "+note);
        }
        @Override public void adjust(){System.out.println("Brass.adjust()");}
    }

    static void tune(Instrument instrument){
        instrument.play(Note.C_SHARP);
    }
    static void tune_All(Instrument[] instruments){
        for(Instrument i:instruments){
            tune(i);
        }
    }
    public static void main(String[] args){
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Woodwind(),
                new Brass(),
        };
        tune_All(orchestra);
    }
}
