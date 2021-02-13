package spring.ioc;

public class MusicPlayer {
    private Music music;

    public MusicPlayer (Music music) {
        this.music = music;
    }

    public void musicPlayer(){
        System.out.println("Playing: " + music.getSong());
    }
}
