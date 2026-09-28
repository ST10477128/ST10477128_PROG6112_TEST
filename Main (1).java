import java.util.Scanner;

// Interface
interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// Abstract class
abstract class Console implements IConsoles {
    protected String consoleType;
    protected String store;
    protected int totalSales;

    // Constructor
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Getter methods
    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return store;
    }

    public int getTotalSales() {
        return totalSales;
    }
}

// Subclass
class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Print report
    public void printReport() {
        System.out.println("\n----- Console Sales Report -----");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Sales: " + getTotalSales());
    }
}

// Application class
class RunApplication {
    public static void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("Select Console Type:");
        System.out.println("1. PlayStation");
        System.out.println("2. Xbox");
        System.out.println("3. Nintendo Switch");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();
        input.nextLine();

        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PlayStation";
                break;
            case 2:
                consoleType = "Xbox";
                break;
            case 3:
                consoleType = "Nintendo Switch";
                break;
            default:
                System.out.println("Invalid choice!");
                input.close();
                return;
        }

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total sales: ");
        int totalSales = input.nextInt();

        ConsoleSales sales =
            new ConsoleSales(consoleType, store, totalSales);

        sales.printReport();

        input.close();
    }
    public class Main {
    public static void main(String[] args) {
        RunApplication.run();
    }
}
}

