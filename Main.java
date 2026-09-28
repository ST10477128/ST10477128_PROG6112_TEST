import java.util.Scanner;

public class GamingConsoleReport {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        // Single-dimensional arrays holding the city names
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria" };
        
        // Single-dimensional arrays holding the gaming console names
        String[] gamingconsoles = {"PS5", "XBOX", "SWITCH"};
        
        //Two-dimensional arrays: rows = cities, columns = gaming console names
        int[][] totalSales = {
                    {1000, 2000, 3000},
                    {2000, 3000, 4000},
                    {1500, 1100, 1200}
        };
        
        int highestTotal = 0;
        String highestCity = "";
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.print("-------------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-12s %-10s%n" ,
                    "PS5" , "XBOX" , "SWITCH");
            
        for (int i = 0; i < cities.length; i++) {
            int total = totalSales[i][0] + totalSales[i][1] + totalSales[i][2];
            
            System.out.printf("%-20s %-10d %-12d %-10d%n",
                     cities[i][0],
                     totalSales[i][1],
                     totalSales[i][2]);
                     
            if (total > highestTotal) {
                highestTotal = total;
                highestCity = cities[i];
            }
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Console sales totals for each city :");
        System.out.println("Cape Town: " + totalSales);
        System.out.println("Port Elizabeth: " + totalSales);
        System.out.println("Pretoria: " + totalSales);
        
        input.close();
        
        
    }
}