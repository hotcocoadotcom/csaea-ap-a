public class ComputerTester {
    public static void main(String[] args) {
        Computer john = new Computer("John", "John Brotato", 512, 3.5);
        Computer sarah = new Computer("Sarah-PC", "sarah cooler", 1024, 4.5);
        Computer mike = new Computer("DESKTOP-27HF8B3", "hellomichael", 128, 1.5);

        // turn john and sarahs PCs on, leave mikes off.
        john.pressPowerButton();
        sarah.pressPowerButton();

        john.writeStorage(15); // subtract 15 from john storageLeft
        sarah.writeStorage(20); // subtract 20 from sarah storageLeft
        sarah.freeStorage(3); // add 3 to sarah storageLeft

        mike.writeStorage(12); // will not write because PC is not on.

        System.out.println(john);
        System.out.println(sarah);

        mike.setClockSpeed(3.3); // PC must be off to change clock speed!!!!

        System.out.println(mike);

        System.out.println("expect sarah - " + sarah.getUserFirstName());
        System.out.println("expect hellomichael - " + mike.getUserFirstName());

        System.out.println("expect true - " + john.isCompany());
        System.out.println("expect false - " + sarah.isCompany());

        System.out.println("expect true - " + john.isOn());
        System.out.println("expect false - " + mike.isOn());
    }
}
