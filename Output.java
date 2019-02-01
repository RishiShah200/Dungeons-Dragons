public class Output{
	public String classT;
    public Output(Adventurer ok){
		classT = ok.ClassType();
        System.out.println("Name: " + ok.getName());
        System.out.print("Race: " + ok.getRace()+"\t");
        System.out.print("Race: " + ok.getRace()+"\t");
        System.out.println("Age: " + ok.getAge());
        System.out.print("Class: " + ok.ClassType()+"\t\t");
        System.out.println("Level: " + ok.getLevel());
        System.out.print("Speed: " + ok.getSpeed()+"\t\t");
        System.out.println("Sight: " + ok.getSight());
        System.out.println("Hit Points: " + ok.getHP());
        makeALine();
        System.out.println("Strength: " + ok.getAttribute(0) + "\t\tModifier: " + ok.getAttributeMods(0));
        System.out.println("Dexterity: " + ok.getAttribute(1) + "\t\tModifier: " + ok.getAttributeMods(1));
        if(ok.getAttribute(2)>=10)
			System.out.println("Constitution: " + ok.getAttribute(2) + "\tModifier: " + ok.getAttributeMods(2));
        else
			System.out.println("Constitution: " + ok.getAttribute(2) + "\t\tModifier: " + ok.getAttributeMods(2));
		if(ok.getAttribute(3)>=10)
        	System.out.println("Intelligence: " + ok.getAttribute(3) + "\tModifier: " + ok.getAttributeMods(3));
        else
        	System.out.println("Intelligence: " + ok.getAttribute(3) + "\t\tModifier: " + ok.getAttributeMods(3));
        System.out.println("Wisdom: " + ok.getAttribute(4) + "\t\tModifier: " + ok.getAttributeMods(4));
        System.out.println("Charisma: " + ok.getAttribute(5) + "\t\tModifier: " + ok.getAttributeMods(5));
        makeALine();
        System.out.println("Weapon List:");
        System.out.println("Weapon One: " + ok.getWeapons(0) + "\tWeapon Two: " + ok.getWeapons(1));
        ASCII();
    }
    public void makeALine(){
        System.out.println("-------------------------------------------------------------");
    }
    public void ASCII(){
		if(classT.equals("Barbarian")){
			System.out.println("          /)");
			System.out.println("         //");
			System.out.println(".-------| |--------------------------------------------.__");
			System.out.println("|WMWMWMW| |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:>");
			System.out.println("`-------| |--------------------------------------------'^^");
			System.out.println("         \\\\");
			System.out.println("          \\)");
			System.out.println("Barbarian LongSword");
		}
		if(classT.equals("Bard")){
			System.out.println(">>>>>>>_____________________\\`-._");
			System.out.println(">>>>>>>                     //.-'");
			System.out.println("Bard Crossbow");
		}
		if(classT.equals("Cleric")){
			System.out.println("      //| ________________");
			System.out.println("O|===|* >________________>");
			System.out.println("      \\|");
			System.out.println("Dagger");
		}
		if(classT.equals("Druid")){
			System.out.println("\t\t<<()>>");
			System.out.println("\t\t)__(");
			System.out.println("\t\t)__(");
			System.out.println("\t\t)__(");
			System.out.println("\t\t)__(");
			System.out.println("\t\t)__(");
			System.out.println("\t\t)__(");
			System.out.println("\t\t)__(");
			System.out.println("\t\t)__(");
			System.out.println("\t\t)__(");
			System.out.println("\t\t)__(");
			System.out.println("\t\t_)__(_");
			System.out.println("\t\t.'      `.");
			System.out.println("\t\t| <   >  |>");
			System.out.println("\t\t<|   <   >|");
			System.out.println("\t\t`.____.'");
			System.out.println("\t\tV  V");
			System.out.println("Druid Mace");
		}
		if(classT.equals("Fighter")){
			System.out.println("          /)");
			System.out.println("         //");
			System.out.println(".-------| |--------------------------------------------.__");
			System.out.println("|WMWMWMW| |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:>");
			System.out.println("`-------| |--------------------------------------------'^^");
			System.out.println("         \\\\");
			System.out.println("          \\)");
			System.out.println("Fighter LongSword");
		}
		if(classT.equals("Monk")){
			System.out.println(".______________________________________________________|_._._._._._._._._._.");
			System.out.println(" \\_____________________________________________________|_#_#_#_#_#_#_#_#_#_|");
			System.out.println("Monk Katana");
		}
		if(classT.equals("Paladin")){
			System.out.println("          /)");
			System.out.println("         //");
			System.out.println(".-------| |--------------------------------------------.__");
			System.out.println("|WMWMWMW| |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:>");
			System.out.println("`-------| |--------------------------------------------'^^");
			System.out.println("         \\\\");
			System.out.println("          \\)");
			System.out.println("Paladin LongSword");
		}
		if(classT.equals("Ranger")){
			System.out.println("   (");
			System.out.println("    \\");
			System.out.println("     )");
			System.out.println("##-------->");
			System.out.println("     )");
			System.out.println("    /");
			System.out.println("   (");
			System.out.println("Ranger ShortBow");
		}
		if(classT.equals("Rogue")){
			System.out.println("        _");
			System.out.println("       < \\");
			System.out.println("[\\\\\\\\\\\\(O):::<======================================-");
			System.out.println(" \\<      >  \\");
			System.out.println("  \\\\    /    |");
			System.out.println("   `==='____/");
			System.out.println("Rapier");
		}
		if(classT.equals("Sorceror")){
			System.out.println("\\\\\\\\\\\\       ________       ");
			System.out.println(" >>>>>>---==(________)------");
			System.out.println("//////");
			System.out.println("Sorceror Darts");
		}
		if(classT.equals("Warlock")){
			System.out.println("\\\\\\\\\\\\       ________       ");
			System.out.println(" >>>>>>---==(________)------");
			System.out.println("//////");
			System.out.println("Warlock Darts");
		}
		if(classT.equals("Wizard")){
			System.out.println("                  .");
			System.out.println();
			System.out.println("                   .");
			System.out.println("         /^\\     .");
			System.out.println("    /\\   \"V\"");
			System.out.println("   /__\\   I      O  o");
			System.out.println("  //..\\   I     .");
			System.out.println("  \\].`[/  I");
			System.out.println("  /l\\/j\\  (]    .  O");
			System.out.println(" /. ~~ ,\\/I          .");
			System.out.println(" \\L__j^\\/ I       o");
			System.out.println("  \\/--v}  I     o   .");
			System.out.println("  |    |  I   _________");
			System.out.println("  |    |  I c(`       ')o");
			System.out.println("  |    l  I   \\.     ,/");
			System.out.println("_/j  L l\\_!  _//^---^\\_  ");
			System.out.println("Wizard Quarterstaff");

		}

	}


}