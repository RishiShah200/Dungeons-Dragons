public class Output{
    public Output(Adventurer ok){

        System.out.println("Name: " + ok.getName());
        System.out.println("Race: " + ok.getRace());
        System.out.println("Age: " + ok.getAge());
        System.out.println("Class: " + ok.ClassType());
        System.out.println("Level: " + ok.getLevel());
        System.out.println("Speed: " + ok.getSpeed());
        System.out.println("Sight: " + ok.getSight());
        System.out.println("Hit Points: " + ok.getHP());
        makeALine();
        System.out.println("Strength: " + ok.getAttribute(0) + "\tModifier: " + ok.getAttributeMods(0));
        System.out.println("Dexterity: " + ok.getAttribute(1) + "\tModifier: " + ok.getAttributeMods(1));
        System.out.println("Constitution: " + ok.getAttribute(2) + "\tModifier: " + ok.getAttributeMods(2));
        System.out.println("Intelligence: " + ok.getAttribute(3) + "\tModifier: " + ok.getAttributeMods(3));
        System.out.println("Wisdom: " + ok.getAttribute(4) + "\tModifier: " + ok.getAttributeMods(4));
        System.out.println("Charisma: " + ok.getAttribute(5) + "\tModifier: " + ok.getAttributeMods(5));
        makeALine();
        System.out.println("Weapon List:");
        System.out.println("Weapon One: " + ok.getWeapons(0) + "\tWeapon Two: " + ok.getWeapons(1));
    }
    public void makeALine(){
        System.out.println("-------------------------------------------------------------");
    }
}