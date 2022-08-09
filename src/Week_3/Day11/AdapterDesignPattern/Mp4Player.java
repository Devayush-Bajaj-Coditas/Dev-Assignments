package Week_3.Day11.AdapterDesignPattern;

public class Mp4Player implements AdvancedMediaPlayer{
    public void playVlc(String filename){
        //Do Nothing
    }
    public void playMp4(String filename){
        System.out.println("Playing mp4 file -----> " + filename);
    }
}
