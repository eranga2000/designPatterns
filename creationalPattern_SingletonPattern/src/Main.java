public class Main {
    public static void main(String[] args) {
        // Usage example
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();

        // Both printer1 and printer2 should refer to the same instance
        System.out.println(printer1 == printer2);  // Output: true

        printer1.printDocument("Test Document 1");
        printer2.printDocument("Test Document 2");
    }
}