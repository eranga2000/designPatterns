public class Printer {
    // The single instance of the class
    private static Printer instance;

    // Private constructor to prevent instantiation
    private Printer() {
        // Initialize the printer ( set up connection)
        System.out.println("Printer initialized: Default Printer");
    }

    // Public method to provide access to the instance
    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    // Example method to simulate printing a document
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
        // Simulate printing process
    }
}