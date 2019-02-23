package preview;

public class P173_Music5
{
    enum Note{MIDDLE_C, C_SHARP, B_FLAT,}
    interface Instrument{
        int VALUE = 5;//默认是PUBLIC,所以子类（导出类）显式PUBLIC
        void play(Note note);
        void adjust();
    }
    static class Wind implements Instrument{
        @Override public void play(Note note){
            System.out.println(this+".play() "+note);
        }
        @Override public void adjust(){
            System.out.println(this+".adjust()");
        }
        @Override public String toString(){return "Wind";}
    }
    static class Percussion implements Instrument{
        @Override public void play(Note note){
            System.out.println(this+".play() "+note);
        }
        @Override public void adjust(){
            System.out.println(this+".adjust()");
        }
        @Override public String toString(){return "Percussion";}
    }
    static class Stringed implements Instrument{
        @Override public void play(Note note){
            System.out.println(this+".play() "+note);
        }
        @Override public void adjust(){
            System.out.println(this+".adjust()");
        }
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
