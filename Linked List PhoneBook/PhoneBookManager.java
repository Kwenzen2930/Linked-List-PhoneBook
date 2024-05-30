import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PhoneBookManager {
    private ArrayList<listNode> phoneBook;

    public PhoneBookManager() {
        this.phoneBook = new ArrayList<>();
    }

    public void addEntry(listNode entry) {
        this.phoneBook.add(entry);
        this.sort();
    }

    public void sort() { // method to sort the phonebook by their last names
        this.phoneBook.sort((entry1, entry2) -> {
            // Sorting entries based on last names
            String lastName1 = entry1.getName().split(" ")[entry1.getName().split(" ").length - 1];
            String lastName2 = entry2.getName().split(" ")[entry2.getName().split(" ").length - 1];
            return lastName1.compareTo(lastName2);
        });
    }

    public void modifyEntry(String name, String address, String city, String phoneNo) { // method to modify an entry
        for (listNode entry : this.phoneBook) {
            if (entry.getName().equals(name)) {
                entry.setAddress(address);
                entry.setCity(city);
                entry.setPhoneNumber(phoneNo);
                return;
            }
        }
        throw new NoSuchElementException("Name cannot be found in phone book"); // Throwing an exception if name is not
                                                                                // found in the phone book
    }

    // Method to delete an entry
    public void deleteEntry(String name) {
        for (int i = 0; i < this.phoneBook.size(); i++) {
            listNode entry = this.phoneBook.get(i);
            if (entry.getName().equals(name)) {
                this.phoneBook.remove(i);
                return;
            }
        }
        throw new NoSuchElementException("Name cannot be found in phone book");
    }

    // Method to move an entry
    public void moveEntry(String name, String address, String city, String phoneNo) {
        try {
            this.deleteEntry(name);
            this.addEntry(new listNode(name, address, city, phoneNo));
        } catch (NoSuchElementException e) { // Handle an exception if name cannot be found in phonebook
            System.out.println("Name cannot be found in phone book");
        }
    }

    public void print() {
        for (listNode entry : this.phoneBook) {
            System.out.println(entry.toString());
        }
    }
}