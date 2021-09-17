// Jeneerthan Pageerathan
// 101153531


import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public boolean removeBuddy(String name) {
        int index = findBuddy(name);
        if (index != -1) {
            buddies.remove(index);
            return true;
        }
        return false;
    }

    /**
     * @param name String for the name of the BuddyInfo object
     * @return index of the BuddyInfo object within buddies
     */
    private int findBuddy(String name) {
        for (int i = 0; i < buddies.size(); i++) {
            if (buddies.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo b1 = new BuddyInfo("John", "Toronto", "6471239876");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(b1);
        addressBook.removeBuddy("John");
    }
}