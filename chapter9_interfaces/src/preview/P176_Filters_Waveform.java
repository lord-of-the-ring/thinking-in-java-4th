package preview;

public class P176_Filters_Waveform
{
    static class Waveform{
        private static long counter;
        private long id = counter++;
        @Override public String toString(){return "Waveform "+id;}
    }
    static class Filter{
        public String name(){
            return this.getClass().getSimpleName();
        }
        public Waveform process(Waveform input){return input;}
    }
    static class LowPass extends Filter{
        double cutoff;
        public LowPass(double cutoff){this.cutoff = cutoff;}
        /*@Override public Waveform process(Waveform input){
            return input;
        }*/
    }
    static class HighPass extends Filter{
        double cutoff;
        public HighPass(double cutoff){this.cutoff = cutoff;}
    }
    static class BandPass extends Filter{
        double lowCutoff, highCutoff;
        public BandPass(double lowCutoff, double highCutoff){
            this.lowCutoff = lowCutoff;
            this.highCutoff = highCutoff;
        }
    }
}
