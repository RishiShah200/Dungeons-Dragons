import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.util.ArrayList;

public class Runner {

    public Runner() {
        ArrayList<Adventurer> characters = new ArrayList<Adventurer>();
        for (int x = 0; x < 10; x++) {
            characters.add(new Adventurer(determineName()));
        }
        for (int x = 0; x < 10; x++) {
            System.out.println("\n\nAdventurer #" + x);
            Output output = new Output(characters.get(x));
        }
    }

    public static void main(String[] args) {
        playMusic("music.wav");
        Runner app = new Runner();
    }

    public String determineName() {
        String[] name = {"Rishi", "Rachit", "Zareeb", "Anish", "Prabhav", "PewdiePie", "Mr.Beast", "Ninja", "Mario", "Luigi"};
        int rand = (int) (Math.random() * 10);
        Adventurer actor = new Adventurer(name[rand]);
        return name[rand];
    }

    public static void playMusic(String filepath) {
        InputStream music;
        try {
            music = new FileInputStream(new File(filepath));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}