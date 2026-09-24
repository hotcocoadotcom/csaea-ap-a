public class LaserGun {
    private String color;
    private int ammo;
    private double strength; // anywhere between 0 - 5
    private int health; // every time you shoot, it loses 1 of its health. it has 50 uses max before breaking.
    private boolean isBroken;

    public LaserGun(String color, int ammo, double strength)
    {
        this.color = color;
        this.ammo = ammo;
        this.strength = strength;

        health = 50;
        isBroken = false;
        System.out.println("created "+color+" laser gun with "+ammo+" ammo and "+strength+" strength");
    }

    public void shoot(int times)
    {
        for (int i=0; i < times; i++)
        {
            if (ammo > 0 && health > 0)
            {
                ammo--;
                health--;
                if (health == 0) { isBroken = true; System.out.println("laser gun now has "+ammo+" ammo and "+health+" health left"); }
            }
            else if (ammo == 0 && health > 0)
            {
                System.out.println("cant shoot! laser gun has 0 ammo and "+health+" health left");
                return;
            }
            else
            {
                System.out.println("you can not shoot a broken laser gun!");
                return;
            }
        }
        System.out.println("laser gun now has "+ammo+" ammo and "+health+" health left");
    }

    public void shoot()
    {
        shoot(1);
    }

    public void repair(int amount)
    {
        if (!isBroken)
        {
            if ((health + amount) < 50)
            {
                health += amount;
            }
            else
            {
                health = 50;
            }
            System.out.println("health set to "+health);
        }
        else
        {
            System.out.println("you can not repair a broken laser gun!");
        }
    }

    public void upgradeStrength(double amount)
    {
        if (!isBroken)
        {
            if ((strength + amount) < 5)
            {
                strength += amount;
            }
            else
            {
                strength = 5;
            }
            System.out.println("strength set to "+strength);
        }
        else
        {
            System.out.println("you can not upgrade a broken laser gun!");
        }
    }

    public void refillAmmo(double amount)
    {
        if (!isBroken)
        {
            ammo += amount;
        }
        else
        {
            System.out.println("you can't refill a BROKEN laser gun!!!!!!1");
        }
    }

    public int getAmmoAmount()
    {
        System.out.println("you have "+ammo+" ammo left");
        return ammo;
    }

    public double getHealth()
    {
        System.out.println("you have "+health+" health for laser gun");
        return health;
    }

    public String getColor()
    {
        System.out.println("the laser gun is "+color);
        return color;
    }
}