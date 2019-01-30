public class Output{
	public Output(Adventurer ok){
//	for(int i = 0;i<10;i++){
		System.out.println();
		System.out.println(ok.getName());
		System.out.println("Race: " + ok.getRace());
		System.out.println("Class: " + ok.getClassType());
		//System.out.println("Speed: " + ok.getSpeed());
		System.out.println("Hitpoints: " + ok.getHP());
		System.out.println("Age: " + ok.getAge());
		System.out.println("Level: " + ok.getLevel());
		System.out.println("Sight: " + ok.getSight());
		line();
		System.out.println();
		System.out.println("Strength: " + ok.getStrength());
	//	System.out.print("\tModifier: " + ok.AttributeArray());
		System.out.println("Dexterity: " + ok.getDexterity());
		System.out.println("Consitution: " + ok.getConstitution());
		System.out.println("Intelligence: " + ok.getIntelligence());
		System.out.println("Wisdom: " + ok.getWisdom());
		System.out.println("Charisma: " + ok.getCharisma());
		//System.out.println("Weapons List: " + ok.determineWeapon());
	//}

}

		public void line(){
			System.out.print("--------------");
		}

}

//ynot