import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.util.ArrayList;
public class Runner{

    public Runner(){
        String name = "Mr.Joe";
        Adventurer ok = new Adventurer(name);
       // Output output = new Output(ok);
        ArrayList<Adventurer> characters = new ArrayList<>(10);		//This code needs to be fixed, does not properly output the Output.java file
        characters.add((Adventurer)ok);

        //CHANGES HAVE BEEN MADE

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