import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//user input
        Scanner s = new Scanner(System.in);
        System.out.println("What is the total bill: ");
        String a = s.nextLine();
        double totalbill = Double.parseDouble(a);
        System.out.println("What tip percent would you live to give: ");
        String b = s.nextLine();
        double tipPercentage = Double.parseDouble(b);
        System.out.println("How many people are in the party: ");
        String c = s.nextLine();
        int numOfPeople = Integer.parseInt(c);
//calculations
        double totalTipAmt = totalbill*(tipPercentage/100);
        double billWithTip= totalTipAmt+totalbill;
        double billPerPerson = totalbill/numOfPeople;
        double eachPersonTipAmt = billPerPerson*(tipPercentage/100);
        double totalPerPerson = eachPersonTipAmt*numOfPeople;
//output
        System.out.println();
        System.out.println("Your total tip amount is: " + (double) Math.round(totalTipAmt*100)/100);
        System.out.println("Your total bill including tip is: " + (double) Math.round(billWithTip*100)/100);
        System.out.println("Your total tip per person is: " + (double) Math.round(billPerPerson*100)/100);
        System.out.println("Your total per person is " + (double) Math.round(totalPerPerson*100)/100);

    }
}