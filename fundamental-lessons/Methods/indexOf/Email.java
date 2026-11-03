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
        return address.indexOf("hcvsd.org") != -1;
    }

    public String getFirstName() {
        String user = getUser();
        return user.substring(0, user.indexOf("."));
    }

    public void changeDomain(String n) {
        address = getUser() + "@" + n;
    }

    public String getLabel() {
        if (isSchool()) {
            return "School: " + getDomain();
        }
        else {
            return "Personal: " + getDomain();
        }
    }

    public boolean isStaffFormat() {
        return getUser().indexOf(".") != -1 && toString().indexOf("hcvsd.org") != -1;
    }
}
