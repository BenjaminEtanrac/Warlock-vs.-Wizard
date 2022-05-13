public class Character {
    public String characterName = "Gandalf";
    public int level = 10;
    public int healthPoints = 300;
    public int manaPoints = 500;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
  

    Character(String name){
        characterName = name;
    }

    Character(String newName, int newLevel, int newHP, int newMana){
        newName = characterName;
        newLevel = level;
        newHP = healthPoints;
        newMana = manaPoints;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     * @return 
     */
    void printName(String Name){
        System.out.println("Character Initialized: " + Name);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);
        System.out.println(enemyCharacter.characterName + " HP Deducted");

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */

        if(enemyCharacter.healthPoints <= 0){
            System.out.println("Character "+ enemyCharacter.characterName + " is now defeated");
            levelUp();
        }
    }

    public void recover(int HP, int MP){
        healthPoints += HP;
        manaPoints += MP;
    }


    public void levelUp(){
        level += 10;
        System.out.println("**********" + characterName + " is now level " + level + "**********");
    }

}