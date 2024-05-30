public class TestClass {
    public static void main(String[] args) {
        PhoneBookManager phoneBook = new PhoneBookManager();

        // Add contacts to the phone book
        phoneBook.addEntry(new listNode(
                "Jake Paul",
                "123 Goal St",
                "Tokyo",
                "189-5893"));

        phoneBook.addEntry(new listNode(
                "Logan Paul",
                "345 Bruh St",
                "Jakarta",
                "905-3856"));

        phoneBook.addEntry(new listNode(
                "Kelvin Paul",
                "784 Madrid St",
                "Madrid",
                "910-2893"));

        phoneBook.sort(); // Sort the phone book entries

        phoneBook.print();

        // Modifies the entry for "Jake Paul"
        phoneBook.modifyEntry("Jake Paul", "123 Goal St", "Tokyo", "189-5893");
        // Delete the entry for "Jake Paul"
        phoneBook.deleteEntry("Jake Paul");

        phoneBook.print(); // Prints updated phonebook
        // Tries to move the entry for "Jake Paul" (which is already deleted)
        phoneBook.moveEntry("Jake Paul", "123 Goal St", "Tokyo", "189-5893");

        phoneBook.print(); // Prints the phonebook again
    }
}