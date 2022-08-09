package Week_3.Day11.AdapterDesignPattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc (String filename){
        System.out.println("Playing VLC file -----> " + filename);
    }
    public void playMp4(String filename){
        //do Nothing
    }
}
