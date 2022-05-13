public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }
    public void disintegrate(Character enemyCharacter){
        super.manaPoints -= 75;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Disintegrate (Damage - 60)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        display1();
        display2(enemyCharacter);
    };

    public void lightningBolt(Character enemyCharacter){
        super.manaPoints -= 45;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Lightning Bolt (Damage - 20)");
        int damagePoints = 30;
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
        System.out.println("Warlock: " + super.characterName);
        System.out.println("HP: " + super.healthPoints);
        System.out.println("MP: " + super.manaPoints);
        
    }

    public void display2(Character enemyCharacter){
        System.out.println("Wizard: " + enemyCharacter.characterName);
        System.out.println("HP: " + enemyCharacter.healthPoints);
        System.out.println("MP: " + enemyCharacter.manaPoints);
        System.out.println("----------------------------------");
        System.out.println("\n");
    }

    
}
