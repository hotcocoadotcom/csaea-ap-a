public class EmailTester {
    public static void main(String[] args) {
        String word = "banana";

        System.out.println(word.indexOf("b"));
        System.out.println(word.indexOf("a"));
        System.out.println(word.indexOf("nan"));
        System.out.println(word.indexOf("z"));
        System.out.println(word.indexOf("B"));

        Email michael = new Email("mharrell@nhvweb.net");
        Email jojo = new Email("jojo@nhvweb.net");

        System.out.println(michael);

        System.out.println(michael.getAtIndex());
        System.out.println(jojo.getAtIndex());

        System.out.println(michael.getUser());
        System.out.println(jojo.getUser());

        System.out.println(michael.getDomain());
    }
}
