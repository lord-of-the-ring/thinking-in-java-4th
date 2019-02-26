package exercises;

public class Exercise9_P174
{
    enum Note{MIDDLE_C, C_SHARP, B_FLAT,}
    static abstract class Instrument{
        int VALUE = 5;//
        void play(Note note){System.out.println(this+".play() "+note);};
        void adjust(){System.out.println(this+".adjust()");};
        abstract public String toString();
    }
    static class Wind extends Instrument{
        @Override public String toString(){return "Wind";}
    }
    static class Percussion extends Instrument{
        @Override public String toString(){return "Percussion";}
    }
    static class Stringed extends Instrument{
        @Override public String toString(){return "Stringed";}
    }
    static class Woodwind extends Wind{
        @Override public String toString(){return "Woodwind";}
    }
    static class Brass extends Wind{
        @Override public String toString(){return "Brass";}
    }
    static void tune(Instrument instrument){instrument.play(Note.C_SHARP);}
    static void tune_All(Instrument[] instruments){
        for(Instrument instrument:instruments){
            tune(instrument);
        }
    }
    public static void main(String[] args){
        Instrument[] orchestra = {//upcasting
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Woodwind(),
                new Brass(),
        };
        tune_All(orchestra);
    }
}
