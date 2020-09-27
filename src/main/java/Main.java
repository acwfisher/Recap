public class Main {

    public static void main(String[] args) {

        try {
            ExceptionDemo.exceptionTesting();
            System.out.println("It worked!");
        }
        catch (Exception exception) {
            System.out.println("Something broke!");
            exception.printStackTrace();
        }
        finally {
            System.out.println("All done!");
        }
    }
}
