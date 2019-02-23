package preview;
//import preview.*;
import preview.P176_Filters_Waveform.*;
//import preview.P177_Interfacepro_Apply.*;
public class P178_FilterProcessor
{
    static class FilterAdapter implements P177_Interfacepro_Apply.Processor{
        Filter filter;
        public FilterAdapter(Filter filter){
            this.filter = filter;
        }
        public String name(){return filter.name();}
        public Waveform process(Object input){
            return filter.process((Waveform) input);
        }
    }
    public static void main(String[] args){
        Waveform waveform = new Waveform();
        P177_Interfacepro_Apply.process(new FilterAdapter(new LowPass(1.0)),waveform);
        P177_Interfacepro_Apply.process(new FilterAdapter(new HighPass(2.0)),waveform);
        P177_Interfacepro_Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),waveform);
    }
}
