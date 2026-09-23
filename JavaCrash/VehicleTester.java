public class VehicleTester {
    
    public static void main(String[] args)
    {
        int john = 203;
        int joel = 239;
        int scar = 365;
        int hi = 732;
        int theseAreJustTestVariablesSoICanHavePeople = 923;


        Vehicle sporter = new Vehicle("sportscar", "white", new double[]{0.0, 0.0});
        Vehicle trucky = new Vehicle("truck", "red", new double[]{20.0, -8.0});
        Vehicle dirtbike = new Vehicle("motorcycle", "green", new double[]{-20.0, 50.0});
        Vehicle fortnite = new Vehicle("car", "fortnite", new double[]{239.0, -23958.0});
        Vehicle hello = new Vehicle("motorcycle", "blue", new double[]{103.0, 1048.0});

        System.out.println();

        sporter.moveForward(0, 1);
        sporter.moveForward(1, 0);

        trucky.setVehicleHealth(trucky.getVehicleHealth() / 2);

        dirtbike.getPassengers();

        dirtbike.enterVehicle(john);
        dirtbike.enterVehicle(joel);
        dirtbike.enterVehicle(scar);

        dirtbike.getPassengers();

        dirtbike.exitVehicle(joel);

        fortnite.enterVehicle(joel);
        fortnite.enterVehicle(theseAreJustTestVariablesSoICanHavePeople);

        hello.moveReverse(0, -1);
        hello.moveReverse(0, -1);
        hello.moveReverse(0, -1);
    }

}
