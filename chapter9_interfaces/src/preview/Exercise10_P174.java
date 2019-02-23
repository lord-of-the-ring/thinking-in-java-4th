package preview;

public class Exercise10_P174
{
    enum Note{MIDDLE_C, C_SHARP, B_FLAT,}
    static abstract class Instrument{
        int VALUE = 5;//
        //void play(Note note){System.out.println(this+".play() "+note);};
        void adjust(){System.out.println(this+".adjust()");};
        abstract public String toString();
    }
    interface Playable{
        void play(Note note);
    }
    static class Wind extends Instrument implements Playable{
        @Override public void play(Note note){System.out.println(this+".play() "+note);}
        @Override public String toString(){return "Wind";}
    }
    static class Percussion extends Instrument implements Playable{
        @Override public void play(Note note){System.out.println(this+".play() "+note);}
        @Override public String toString(){return "Percussion";}
    }
    static class Stringed extends Instrument implements Playable{
        @Override public void play(Note note){System.out.println(this+".play() "+note);}
        @Override public String toString(){return "Stringed";}
    }
    static class Woodwind extends Wind{
        @Override public String toString(){return "Woodwind";}
    }
    static class Brass extends Wind{
        @Override public String toString(){return "Brass";}
    }
    static void tune(Playable playable){playable.play(Note.C_SHARP);}
    static void tune_All(Playable[] playables){
        for(Playable playable:playables){
            tune(playable);
        }
    }
    public static void main(String[] args){
        Playable[] orchestra = {//upcasting
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Woodwind(),
                new Brass(),
        };
        tune_All(orchestra);
    }
}
