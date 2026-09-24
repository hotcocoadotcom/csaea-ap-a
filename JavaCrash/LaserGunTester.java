public class LaserGunTester {
    
    public static void main(String[] args)
    {
        LaserGun gun1 = new LaserGun("blue", 25, 0.2);
        LaserGun gun2 = new LaserGun("green", 60, 0.6);

        System.out.println();

        gun1.shoot();
        gun1.shoot(12);

        System.out.println();

        gun1.getColor();
        gun1.getAmmoAmount();

        System.out.println();

        gun1.repair(1000);

        System.out.println();

        gun2.shoot(35);

        System.out.println();

        gun2.upgradeStrength(0.4);

        System.out.println();

        gun2.getHealth();

        System.out.println();

        gun2.shoot(20);
    }
}
