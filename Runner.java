import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Runner{

    public Runner(){
        String name = "Mr.Joe";
        Adventurer ok = new Adventurer(name);
        Output output = new Output(ok);
//CHANGES HAVE BEEN MADE WOHOO

    }

    public static void main(String[]args){
		playMusic("music.wav");
        Runner app = new Runner();
    }
    public static void playMusic(String filepath){
		InputStream music;
		try{
			music = new FileInputStream(new File(filepath));
			AudioStream audios = new AudioStream(music);
			AudioPlayer.player.start(audios);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error");
		}
	}
}