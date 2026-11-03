public class EmailTester {
    public static void main(String[] args) {
        String word = "banana";

        System.out.println(word.indexOf("b"));
        System.out.println(word.indexOf("a"));
        System.out.println(word.indexOf("nan"));
        System.out.println(word.indexOf("z"));
        System.out.println(word.indexOf("B"));

        Email jojo = new Email("jojo@nhvweb.net");
        Email michael = new Email("michael.harrell@hcvsd.org");

        System.out.println(michael);

        System.out.println(michael.getAtIndex());
        System.out.println(jojo.getAtIndex());

        System.out.println(michael.getUser());
        System.out.println(jojo.getUser());

        System.out.println(michael.getDomain());

        System.out.println(michael.getFirstName());

        jojo.changeDomain("gmail.com");

        System.out.println(jojo);

        System.out.println(michael.getLabel());
        System.out.println(jojo.getLabel());

        System.out.println(michael.isStaffFormat());
        System.out.println(jojo.isStaffFormat());
    }
}
