public class Email {
    private String address;

    public Email(String a) {
        this.address = a;
    }

    public String toString() {
        return address;
    }

    public int getAtIndex() {
        return address.indexOf("@");
    }

    public String getUser() {
        return address.substring(0, getAtIndex());
    }

    public String getDomain() {
        return address.substring(getAtIndex()+1);
    }

    public boolean isSchool() {
        return false;
    }
}
