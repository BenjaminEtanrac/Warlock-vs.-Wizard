public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }
    public void fireStorm(Character enemyCharacter){
        super.manaPoints -= 80;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 60)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        display1();
        display2(enemyCharacter);
    };

    public void cloudKill(Character enemyCharacter){
        super.manaPoints -= 50;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Cloudkill (Damage - 20)");
        int damagePoints = 20;
        damageTarget(enemyCharacter, damagePoints);
        display1();
        display2(enemyCharacter);
    }
    
    public void heal(){
        System.out.println(super.characterName + " HP and MP increases");
        super.healthPoints = 75;
        super.manaPoints = 200;
        recover(super.healthPoints, super.manaPoints);
        display1();
    }

    public void display1(){
        System.out.println("----------------------------------");
        System.out.println("Wizard: " + super.characterName);
        System.out.println("HP: " + super.healthPoints);
        System.out.println("MP: " + super.manaPoints);
        
    }

    public void display2(Character enemyCharacter){
        System.out.println("Warlock: " + enemyCharacter.characterName);
        System.out.println("HP: " + enemyCharacter.healthPoints);
        System.out.println("MP: " + enemyCharacter.manaPoints);
        System.out.println("----------------------------------");
        System.out.println("\n");
    }


}
