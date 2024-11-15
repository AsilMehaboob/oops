public class CommandLineExample {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length > 0) {
            System.out.println("Arguments passed:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No arguments passed.");
        }
    }
}
