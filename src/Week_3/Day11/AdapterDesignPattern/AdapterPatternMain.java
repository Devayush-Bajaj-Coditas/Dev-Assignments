package Week_3.Day11.AdapterDesignPattern;

public class AdapterPatternMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Kacha Badam.mp3");
        audioPlayer.play("mp4", "Rinkiya ke papa.mp4");
        audioPlayer.play("vlc", "Taar bijli se patle.vlc");
        audioPlayer.play("avi", "kitne fokat ho guys.avi");
    }
}
