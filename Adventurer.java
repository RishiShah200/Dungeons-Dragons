public class Adventurer{
		private String name;
		private String race;
		private int[] modifier;
		private String [] raceNames = {"Human","Elf","Dwarf","Halfling","Dragonborn","Gnome","Half-Elf","Half-Orc","Teifling"};
		private int [] attributes = new int [6];
		private String classtype;
		private int level = 1;
		private int hp;
		private int speed;
		private int sight;
		private int [] modifiers;
		 private String[] characterWeapons = new String[2];
		private int age;
		private String [] weapons = {"Longsword", "Mace", "Warhammer", "Shortsword", "Morningstar", "Greatsword", "Dagger", "Rapier", "Quarterstaff", "Light Crossbow", "Nunchaku", "Katana", "Shortbow", "Longbow", "Darts", "Sling", "Trident", "Scimitar"};
		private int inch;
		private int feet;
	//Making Attributes
		private int strength;
		private int dexterity;
		private int constitution;
		private int intelligence;
		private int wisdom;
		private int charisma;
	public Adventurer(String name){
		this.name = name;
		race = racePicker();
		for(int x = 0;x<6;x++)
			attributes[x] = attributeBuilder();
		if(race.equals("Human")){
			for(int i = 0;i<6;i++)
				attributes[i]+=1;
		}
		if(race.equals("Elf")){
			attributes[1]+=2;
		}
		if(race.equals("Dwarf")){
			attributes[2]+=2;
		}
		if(race.equals("Halfling")){
			attributes[1]+=2;
		}
		if(race.equals("Dragonborn")){
			attributes[0]+=2;
			attributes[5]+=1;
		}
		if(race.equals("Gnome")){
			attributes[3]+=2;
		}
		if(race.equals("Half-Elf")){
			attributes[5]+=2;
			attributes[3]+=1;
			attributes[1]+=1;
		}
		if(race.equals("Half-Orc")){
			attributes[0]+=2;
			attributes[2]+=1;
		}
		if(race.equals("Teifling")){
			attributes[3]+=1;
			attributes[5]+=2;
		}
	//	this.sight = determineSight(modifiers);//FIX THIS
		this.level = level;
		this.modifier = AtrributeModifs(modifiers);
		this.hp = determineHP(modifiers);
		this.classtype = deterClass(attributes);
		this.age = determineAge(name);
		this.strength = attributes[0];
		this.dexterity = attributes[1];
		this.constitution = attributes[2];
		this.intelligence = attributes[3];
		this.wisdom = attributes[4];
		this.charisma = attributes[5];
		//this.speed = determineSpeed(race);

		this.raceNames = raceNames;
		this.attributes = attributes;
		int sum3 = 0;
	}
	public int modify(int x){
		return 1;

	}
	public String getClassType(){
			return classtype;
	}
	public String deterClass(int[] arr){
	        String detClass = "";
	        //0 - Strength
	        //1 - Dexterity
	        //2 - Constitution
	        //3 - Intelligence
	        //4 - Wisdom
	        //5 - Charisma
	        if((arr[0]> arr[1]) && (arr[0] > arr[2]) && (arr[0]> arr[3]) && (arr[0]> arr[4]) && (arr[0]> arr[5]) && (arr[2]> arr[1]) && (arr[2]> arr[3]) && (arr[2]> arr[4]) && (arr[2]> arr[5])){
	            detClass = "Barbarian";
	        }
	        if((arr[5]> arr[0]) && (arr[5]> arr[1]) && (arr[5]> arr[2]) && (arr[5]> arr[3]) && (arr[5]> arr[4]) && (arr[1]> arr[0]) && (arr[1]> arr[2]) && (arr[1]> arr[3]) && (arr[1] > arr[4])){
	            detClass = "Bard";
	        }
	        if((arr[4]> arr[0]) && (arr[4]> arr[1]) && (arr[4]> arr[2]) && (arr[4]> arr[3]) && (arr[4]> arr[5]) && (arr[3]> arr[0]) && (arr[3]> arr[2]) && (arr[3]> arr[4]) && (arr[3] > arr[5])){
	            detClass = "Cleric";
	        }
	        if((arr[4]> arr[0]) && (arr[4]> arr[1]) && (arr[4]> arr[2]) && (arr[4]> arr[3]) && (arr[4]> arr[5]) && (arr[3]> arr[0]) && (arr[3]> arr[2]) && (arr[3]> arr[4]) && (arr[3] > arr[5])){
	            detClass = "Druid";
	        }
	        if((arr[0]> arr[1]) && (arr[0]> arr[2]) && (arr[0]> arr[3]) && (arr[0]> arr[4]) && (arr[0]> arr[5]) && (arr[1]> arr[2]) && (arr[1]> arr[3]) && (arr[1]> arr[4]) && (arr[1] > arr[5])){
	            detClass = "Fighter";
	        }
	        if((arr[1]> arr[0]) && (arr[1]> arr[2]) && (arr[1]> arr[3]) && (arr[1]> arr[4]) && (arr[1]> arr[5]) && (arr[4]> arr[0]) && (arr[4]> arr[2]) && (arr[4]> arr[3]) && (arr[4] > arr[5])){
	            detClass = "Monk";
	        }
	        if((arr[0]> arr[1]) && (arr[0]> arr[2]) && (arr[0]> arr[3]) && (arr[0]> arr[4]) && (arr[0]> arr[5]) && (arr[5]> arr[1]) && (arr[5]> arr[2]) && (arr[5]> arr[3]) && (arr[5] > arr[4])){
	            detClass = "Paladin";
	        }
	        if((arr[4]> arr[0]) && (arr[4]> arr[1]) && (arr[4]> arr[2]) && (arr[4]> arr[3]) && (arr[4]> arr[5]) && (arr[1]> arr[0]) && (arr[1]> arr[2]) && (arr[1]> arr[3]) && (arr[1] > arr[5])) {
	            detClass = "Ranger";
	        }
	        if((arr[1]> arr[0]) && (arr[1]> arr[2]) && (arr[1]> arr[3]) && (arr[1]> arr[4]) && (arr[1]> arr[5]) && (arr[3]> arr[0]) && (arr[3]> arr[2]) && (arr[3]> arr[4]) && (arr[1] > arr[5])){
	            detClass = "Rogue";
	        }
	        if((arr[5]> arr[0]) && (arr[5]> arr[1]) && (arr[5]> arr[2]) && (arr[5]> arr[3]) && (arr[5]> arr[4]) && (arr[2]> arr[1]) && (arr[2]> arr[3]) && (arr[2]> arr[4]) && (arr[2] > arr[5])){
	            detClass = "Sorceror";
	        }
	        if((arr[5]> arr[0]) && (arr[5]> arr[1]) && (arr[5]> arr[2]) && (arr[5]> arr[3]) && (arr[5]> arr[4]) && (arr[4]> arr[0]) && (arr[4]> arr[1]) && (arr[4]> arr[2]) && (arr[4] > arr[3])){
	            detClass = "Warlock";
	        }
	        if((arr[3]> arr[0]) && (arr[3]> arr[1]) && (arr[3]> arr[2]) && (arr[3]> arr[4]) && (arr[3]> arr[5]) && (arr[4]> arr[0]) && (arr[4]> arr[1]) && (arr[4]> arr[2]) && (arr[4] > arr[5])){
	            detClass = "Wizard";
	        }
	        return detClass;
    }
	public int determineHP(int [] arr){
		int hp = 0;
		if(name.equals("Barbarians"))
			hp = (10 + Die(4) + arr[2]);
		if((name.equals("Bards"))||(name.equals("Clerics"))||(name.equals("Druids"))||(name.equals("Monks"))||(name.equals("Rogues"))||(name.equals("Warlocks")))
			hp = (6 + Die(4) + arr[2]);
		if((name.equals("Fighters"))||(name.equals("Paladins"))||(name.equals("Rangers")))
			hp = (8 + Die(4) + arr[2]);
		if((name.equals("Sorcerors"))||(name.equals("Wizards")))
			hp = (4 + Die(4) + arr[2]);
		return hp;
	}
	public void determineHeight(){
	        if(race.equals("Dwarf")){
	            feet = randValue(4,5);
	            if(feet == 4) {
	                inch = randValue(1, 11);
	            }
	        }
	        else if(race.equals("Elf")){
	            feet = randValue(5, 6);
	            if(feet == 5){
	                inch = randValue(1, 11);
	            }
	            else{
	                inch = randValue(1, 2);
	            }
	        }
	        else if(race.equals("Halfling")){
	            feet = randValue(2, 3);
	            if(feet ==2){
	                inch = randValue(6, 11);
	            }
	            else if(feet == 3){
	                inch = randValue(1, 6);
	            }
	        }
	        else if(race.equals("Human")){
	            feet = randValue(5, 6);
	            if(feet == 5){
	                inch = randValue(1, 11);
	            }
	            else{
	                inch = randValue(1, 6);
	            }
	        }
	        else if(race.equals("Dragonborn")){
	            feet = randValue(6, 7);
	            if(feet == 6){
	                inch = randValue(4, 11);
	            }
	            else{
	                inch = randValue(1, 6);
	            }
	        }
	        else if(race.equals("Gnome")){
	            feet = randValue(3, 4);
	            if(feet == 3){
	                inch = randValue(1,11);
	            }
	            else{
	                inch = randValue(1, 4);
	            }
	        }
	        else if(race.equals("Half-Elf")){
	            feet = randValue(5, 6);
	            if(feet == 5){
	                inch = randValue(1, 11);
	            }
	            else{
	                inch = randValue(1, 4);
	            }
	        }
	        else if(race.equals("Half-Orc")){
	            feet = randValue(5, 6);
	            if(feet == 5){
	                inch = randValue(5, 11);
	            }
	            else{
	                inch = randValue(1,10);
	            }
	        }
	        else{         //Teifling
	            feet = randValue(5, 6);
	            if(feet == 5){
	                inch = randValue(1, 11);
	            }
	            else{
	                inch = randValue(1,6);
	            }
	        }
    }
    public void determineWeapon(){
		/*
		longsword = [0]
		mace = [1]
		warhammer = [2]
		shortsword = [3]
		morningstar = [4]
		greatsword = [5]
		dagger = [6]
		rapier = [7]
		quarterstaff = [8]
		light_crossbow = [9]
		nunchaku = [10]
		katana = [11]
		shortbow = [12]
		longbow = [13]
		darts = [14]
		sling = [15]
		trident = [16]
		scimitar = [17]
		*/
		int rand = 0;
		        if(classtype.equals(("Barbarian"))){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 6);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[0];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[1];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[2];
		                }
		                else if (rand == 4) {
		                    characterWeapons[i] = weapons[3];
		                }
		                else if (rand == 5) {
		                    characterWeapons[i] = weapons[4];
		                }
		                else {
		                    characterWeapons[i] = weapons[5];
		                }
		            }
		        }
		        else if(classtype.equals("Bard")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 7);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[6];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[7];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[3];
		                }
		                else if (rand == 4) {
		                    characterWeapons[i] = weapons[0];
		                }
		                else if (rand == 5) {
		                    characterWeapons[i] = weapons[8];
		                }
		                else {
		                    characterWeapons[i] = weapons[9];
		                }
		            }
		        }
		        else if(classtype.equals("Cleric")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 4);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[6];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[14];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[15];
		                }
		                else {
		                    characterWeapons[i] = weapons[8];
		                }
		            }
		        }
		        else if(classtype.equals("Druid")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 7);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[6];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[14];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[15];
		                }
		                else if(rand == 4){
		                    characterWeapons[i] = weapons[8];
		                }
		                else if(rand == 5){
		                    characterWeapons[i] = weapons[16];
		                }
		                else if(rand == 6){
		                    characterWeapons[i] = weapons[1];
		                }
		                else{
		                    characterWeapons[i] = weapons[17];
		                }
		            }
		        }
		        else if(classtype.equals("Fighter")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 6);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[0];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[1];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[2];
		                }
		                else if(rand == 4){
		                    characterWeapons[i] = weapons[3];
		                }
		                else if(rand == 5){
		                    characterWeapons[i] = weapons[4];
		                }
		                else{
		                    characterWeapons[i] = weapons[5];
		                }
		            }
		        }
		        else if(classtype.equals("Monk")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 3);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[8];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[10];
		                }
		                else {
		                    characterWeapons[i] = weapons[11];
		                }
		            }
		        }
		        else if(classtype.equals("Paladin")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 4);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[0];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[1];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[2];
		                }
		                else {
		                    characterWeapons[i] = weapons[3];
		                }
		            }
		        }
		        else if(classtype.equals("Ranger")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 4);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[13];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[12];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[9];
		                }
		                else {
		                    characterWeapons[i] = weapons[0];
		                }
		            }
		        }
		        else if(classtype.equals("Rogue")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 4);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[6];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[7];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[3];
		                }
		                else {
		                    characterWeapons[i] = weapons[0];
		                }
		            }
		        }
		        else if(classtype.equals("Sorcerer")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 4);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[6];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[14];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[15];
		                }
		                else {
		                    characterWeapons[i] = weapons[8];
		                }
		            }
		        }
		        else if(classtype.equals("Warlock")){
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 5);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[6];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[14];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[15];
		                }
		                else if(rand == 4){
		                    characterWeapons[i] = weapons[8];
		                }
		                else{
		                    characterWeapons[i] = weapons[17];
		                }
		            }
		        }
		        else{   //Wizard
		            for(int i = 0; i < 2; i++) {
		                rand = randValue(1, 4);
		                if (rand == 1) {
		                    characterWeapons[i] = weapons[6];   //Character weapons holds the two weapons
		                }
		                else if (rand == 2) {
		                    characterWeapons[i] = weapons[14];
		                }
		                else if (rand == 3) {
		                    characterWeapons[i] = weapons[15];
		                }
		                else {
		                    characterWeapons[i] = weapons[8];
		                }
		            }
		        }
    }
    public void determineSpeed(String race){
		if(race.equals("Dwarf"))
			speed = 25;
		if(race.equals("Elf"))
			speed = 25;
		if(race.equals("Halfling"))
			speed = 25;
		if(race.equals("Human"))
			speed = 30;
		if(race.equals("Dragonborn"))
			speed = 30;
		if(race.equals("Gnome"))
			speed = 25;
		if(race.equals("Half-Elf"))
			speed = 30;
		if(race.equals("Half-Orc"))
			speed = 30;
		if(race.equals("Teifling"))
			speed = 30;
	}
	public void determineSight(String race){
		if(race.equals("Dwarf"))
			sight = 60;
		if(race.equals("Elf"))
			sight = 60;
		if(race.equals("Halfling"))
			sight = 30;
		if(race.equals("Human"))
			sight = 30;
		if(race.equals("Dragonborn"))
			sight = 30;
		if(race.equals("Gnome"))
			sight = 60;
		if(race.equals("Half-Elf"))
			sight = 60;
		if(race.equals("Half-Orc"))
			sight = 30;
		if(race.equals("Teifling"))
			sight = 60;
	}
	 public void AtrributeModifs(int[] arr){
	        for(int i = 0; i < 6; i++){
	            if(arr[i] == 1){
	                modifiers[i] = -5;
	            }
	            if(arr[i] == 2 || arr[i] == 3){
	                modifiers[i] = -4;
	            }
	            if(arr[i] == 4 || arr[i] == 5){
	                modifiers[i] = -3;
	            }
	            if(arr[i] == 6 || arr[i] == 7){
	                modifiers[i] = -2;
	            }
	            if(arr[i] == 8 || arr[i] == 9){
	                modifiers[i] = -1;
	            }
	            if(arr[i] == 10 || arr[i] == 11){
	                modifiers[i] = 0;
	            }
	            if(arr[i] == 12 || arr[i] == 13){
	                modifiers[i] = 1;
	            }
	            if(arr[i] == 14 || arr[i] == 15){
	                modifiers[i] = 2;
	            }
	            if(arr[i] == 16 || arr[i] == 17){
	                modifiers[i] = 3;
	            }
	            if(arr[i] == 18 || arr[i] == 19){
	                modifiers[i] = 4;
	            }
	            else{
	                modifiers[i] = 5;
	            }
	        }
    }
	 public int determineAge(String race){
	        int age = 0;
	        if(race.equals("Dwarf")){
	            age = randValue(50, 250);
	        }
	        else if(race.equals("Elf")){
	            age = randValue(100, 600);
	        }
	        else if(race.equals("Halfling")){
	            age = randValue(20, 120);
	        }
	        else if(race.equals("Human")){
	            age = randValue(17, 55);
	        }
	        else if(race.equals("Dragonborn")){
	            age = randValue(15, 60);
	        }
	        else if(race.equals("Gnome")){
	            age = randValue(40, 425);
	        }
	        else if(race.equals("Half-Elf")){
	            age = randValue(19, 140);
	        }
	        else if(race.equals("Half-Orc")){
	            age = randValue(14, 60);
	        }
	        else{               //Tiefling
	           age = randValue(17, 65);
	        }
	        return age;
    }

	public int Die(int sides){
		int rand = (int)(Math.random()*sides)+1;
		return rand;
	}
	public int randValue(int start,int end){
		int rand = (int)(Math.random()*end)+start;
		return rand;
	}
	public int sum(int x,int y, int z){
		int sum = x+y+z;
		return sum;
	}
	public int [] sortArray(int [] arr){
		for(int i = 0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1];
			arr[arr.length-1] = temp;
		}
		return arr;
	}
	public int attributeBuilder(){
		int[] arr = new int [4];
		int sum3 = 0;
		for(int i = 0;i<arr.length;i++)
			arr[i] = Die(6);
			sortArray(arr);	//insertion sort or selection sort
			return sum3 = sum(arr[0],arr[1],arr[2]);
	}
	public void holdArr(){
			for(int i = 0;i<6;i++){
				attributes[i] = attributeBuilder();
			}
	}
	public String racePicker(){
		int rand = Die(9);
		return raceNames[rand-1];
	}
	public String getName(){
		return name;
	}
	public String getRace(){
		return race;
	}
	public int getSight(){
		return sight;
	}

	public int getLevel(){
		return level;
	}
	public int getHP(){
		return hp;
	}
	public int getAge(){
		return age;
	}
	public int getStrength(){
		return strength;
	}
	public int getDexterity(){
		return dexterity;
	}
	public int getConstitution(){
		return constitution;
	}
	public int getIntelligence(){
		return intelligence;
	}
	public int getWisdom(){
		return wisdom;
	}
	public int getCharisma(){
		return charisma;
	}
}