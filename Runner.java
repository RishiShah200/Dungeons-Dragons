import java.util.ArrayList;
public class Runner{

	public Runner(){
		String name = "Mr.Guy\n";
		Adventurer dude = new Adventurer(name);
		Output output = new Output(dude);

	}

	public static void main(String[]args){
		Runner app = new Runner();
	}
}