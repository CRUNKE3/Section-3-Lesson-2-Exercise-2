
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        int monday = 100;
        int tuesday = 121;
        int wednesday = 117;
        double dailyAverage = (monday+tuesday+wednesday)/3.0;
        double monthlyAverage = dailyAverage*30;
        double sellPrice = 0.18;
        double monthlyProfit = monthlyAverage*sellPrice;
        
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
