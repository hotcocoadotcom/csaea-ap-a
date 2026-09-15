public class Dog {

    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel = 100;

    public Dog(String name, String ownerName, String breed)
    {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        age = 0;
        weight = 10;
        isHungry = true;
        isHome = true;
    }

    public void bark()
    {
        // makes noise, changes nothing
    }

    public void scratch()
    {
        // makes a mess, changes nothing
    }

    public void bite()
    {
        // changes nothing
    }

    public void eat()
    {
        if(isHungry)
        {
            weight += 5;
            isHungry = false;
        }
        else
        {
            weight += 10;
        }
    }

    public void runAway()
    {
        energyLevel -= 25;
        isHome = false;
    }

    public void comeHome()
    {
        isHome = true;
    }

    public void sleep()
    {
        energyLevel = 100;
    }

    public void haveBirthday()
    {
        age += 1;
    }
}
