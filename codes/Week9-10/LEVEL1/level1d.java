// Program to demonstrate and handle NullPointerException

class level1d {
    // Method to generate the Exception
    public void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println("Attempting to get length of null string...");
        int length = text.length();
    }

    // Method to handle NullPointerException
    public void handleException() {
        String text = null;
        try {
            System.out.println("Attempting to get length of null string (with handling)...");
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        level1d obj = new level1d();

        // Initially call the method to generate the exception (will crash if not commented or handled)
        // obj.generateException();

        // Refactor the code to call the method to handle the Exception
        obj.handleException();
    }
}
