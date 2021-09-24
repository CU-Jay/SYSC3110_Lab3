// Jeneerthan Pageerathan
// 101153531

public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        this("Buddy");
    }

    public BuddyInfo(String name) {
        this.name = name;
        this.address = "Unknown";
        this.phoneNumber = "Unknown";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        BuddyInfo b1 = new BuddyInfo("George");
        System.out.println("Hello " + b1.getName());
    }
}
