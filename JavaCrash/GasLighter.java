public class GasLighter {
    String characterName;
    String outfit;
    int attackStrength;
    int health = 100;
    int armor = 0;
    double height;
    int weight;

    public GasLighter(String characterName, String outfit, int attackStrength)
    {
        this.characterName = characterName;
        this.outfit = outfit;
        this.attackStrength = attackStrength;

        height = 1.8;
        weight = 180;
    }

    public void attackCharacter()
    {
        // attacks another character, wouldnt do anything
    }
    
    public void moveElsewhere(int[] location)
    {
        // idk
    }

    public void makeCharacterForget()
    {
        // its like an attack but also not
    }

    public void heal()
    {
        health = 100;
    }

    public void equipArmor()
    {
        armor = 100;
    }

    public void getAttacked()
    {
        health -= 20;
    }
}
