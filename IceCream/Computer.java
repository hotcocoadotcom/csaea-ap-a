public class Computer {
    private String pcName; // name will be same as FirstName if company, it will be anything else if not.
    private String userName;
    private final int storageAmount;
    private int storageLeft;
    private double clockSpeedGHz;
    private boolean isOn;

    public Computer(String pcName, String userName, int storageAmount, double clockSpeedGHz) {
        this.pcName = pcName;
        this.userName = userName;
        this.storageAmount = storageAmount;
        this.clockSpeedGHz = clockSpeedGHz;

        isOn = false;
        storageLeft = storageAmount;
    }

    public String toString() {
        return "Name: " + pcName + " - User Name: " + userName + " - Storage Used: " + storageLeft + "/" + storageAmount + "GB - Clock Speed: " + clockSpeedGHz + "GHz";
    }

    public void writeStorage(int amt) {
        if ((storageLeft - amt) >= 0 && isOn) {
            storageLeft -= amt;
        }
    }

    public void freeStorage(int amt) {
        if ((storageLeft + amt) <= storageAmount && isOn) {
            storageLeft += amt;
        }
        else {
            storageLeft = storageAmount;
        }
    }

    public void setClockSpeed(double speed) {
        if (!isOn) {clockSpeedGHz = speed;}
    }

    public String getUserFirstName() {
        if (userName.indexOf(" ") != -1) {
            return userName.substring(0, userName.indexOf(" "));
        }
        else {
            return userName;
        }
    }

    public boolean isCompany() {
        return getUserFirstName().equals(pcName);
    }

    public void pressPowerButton() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }
}