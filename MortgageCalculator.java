import  java.util.*;
import java.text.NumberFormat;

public class MortgageCalculator {
  public static void main(String[] args){
    int principal;
    float rate;
    final byte percent = 100;
    byte amountOfYears = 0;
    final byte amountOfMonths = 12;
    NumberFormat currency = NumberFormat.getCurrencyInstance();    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal: ");
    principal = scanner.nextInt();

    System.out.print("Annutal Rate: ");
    rate = scanner.nextFloat()/amountOfMonths/percent;
    

    System.out.print("Time Period: ");
    amountOfYears = scanner.nextByte();
    
    int numberOfPayments = amountOfYears * amountOfMonths;
    
    double monthlyPayment = principal * (rate * Math.pow(1+rate,numberOfPayments))/(Math.pow(1+rate, numberOfPayments)-1);
    System.out.println("Monthly Payment: " + currency.format(monthlyPayment));

    
    
  }
}
