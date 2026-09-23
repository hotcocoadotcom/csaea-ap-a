
public class Vehicle
{
    // instance variables
    private String type; // Can be type "car" "sportscar" "truck" "motorcycle"
    private String color; // red, orange, yellow, green, blue, purple, white, black
    private double[] location; // X, Y
    private double speed; //
    private int[] passengers = {0, 0, 0, 0}; // passenger 0 is the driver
    private int maxPassengers;
    private boolean isDestroyed;
    private static int handleCounter = 0;
    public final int handle; //essentially an ID
    private double vehicleHealth; // from 0-1

    public Vehicle(String type, String color, double[] location)
    {
        this.type = type;
        this.color = color;
        this.location = location;

        if(type.equalsIgnoreCase("car"))
        {
            speed = 2.5;
            maxPassengers = 4;
        }
        else if(type.equalsIgnoreCase("sportscar"))
        {
            speed = 4.0;
            maxPassengers = 2;
        }
        else if(type.equalsIgnoreCase("truck"))
        {
            speed = 1.5;
            maxPassengers = 4;
        }
        else if(type.equalsIgnoreCase("motorcycle"))
        {
            speed = 3.0;
            maxPassengers = 2;
        }

        passengers = new int[4];
        isDestroyed = false;
        vehicleHealth = 1.0;
        handle = handleCounter;
        handleCounter++;
        System.out.println("created vehicle at "+handle);
    }

    public void moveForward(double dirX, double dirY) // direction can only be from 0-1
    {
        location[0] += dirX * speed;
        location[1] += dirY * speed;

        System.out.println("Vehicle now at: " + location[0] + ", " + location[1]);
        System.out.println();
    }

    public void moveReverse(double dirX, double dirY)
    {
        location[0] -= dirX * speed;
        location[1] -= dirY * speed;
        System.out.println("Vehicle now at: " + location[0] + ", " + location[1]);
        System.out.println();
    }

    public double getVehicleHealth()
    {
        System.out.println("Vehicle Health: " + vehicleHealth+"\n");
        return vehicleHealth;
    }

    public double setVehicleHealth(double healthSet)
    {
        vehicleHealth = healthSet;
        System.out.println("New Vehicle Health: " + vehicleHealth+"\n");
        return vehicleHealth;
    }

    public void enterVehicle(int enterHandle)
    {
        for(int i=0; i<maxPassengers; i++)
        {
            if(passengers[i] == 0)
            {
                passengers[i] = enterHandle;
                System.out.println("handle "+enterHandle+" has entered "+handle+" in spot "+i+"\n");
                return;
            }
            else
            {
                System.out.println("spot "+i+" is taken by "+passengers[i]);
            }
            
        }
        System.out.println("vehicle full\n");
        
    }

    public void exitVehicle(int exitHandle)
    {
        for(int i=0; i<maxPassengers; i++)
        {
            if(passengers[i] == exitHandle)
            {
                passengers[i] = 0;
                System.out.println("handle "+exitHandle+" has exited "+handle+" in spot "+i+"\n");
                return;
            }
            else
            {
                System.out.println("spot "+i+" is taken by "+passengers[i]);
            }
            
        }
        System.out.println("passenger is not in vehicle\n");
    }

    public int[] getPassengers()
    {
        for(int i=0; i<4; i++)
        {
            System.out.println("slot "+i+" has "+passengers[i]);
        }
        System.out.println();
        return passengers;
    }
}