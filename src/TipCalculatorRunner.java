import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        //take in user inputs
        Scanner s = new Scanner(System.in);
        System.out.print("Number of people: ");
        String people = s.nextLine();
        int numOfPeople = Integer.parseInt(people);
        System.out.print("Bill amount: ");
        String bill = s.nextLine();
        double billAmount = Double.parseDouble(bill);
        System.out.print("Tip percentage: ");
        String tip = s.nextLine();
        int tipNum = Integer.parseInt(tip);

        //makes an instance of TipCalculator class
        TipCalculator t = new TipCalculator(billAmount, tipNum, numOfPeople);

        DecimalFormat toTheFormat = new DecimalFormat("#0.00"); //set up the format

        //stores all the info into variables
        double tipAmount = t.calculateTipAmount();
        double billWithTip = t.calculateBillWithTip();
        double tipPerPerson = t.calculateTipPerPerson();
        double billPerPerson = t.calculateBillPerPerson();

        //format the outputs properly
        String tipAmountFormatted = toTheFormat.format(tipAmount);
        String billWithTipFormatted = toTheFormat.format(billWithTip);
        String tipPerPersonFormatted = toTheFormat.format(tipPerPerson);
        String billPerPersonFormatted = toTheFormat.format(billPerPerson);

        //prints out the final information
        System.out.println("Tip amount: $" + tipAmountFormatted);
        System.out.println("Total bill: $" + billWithTipFormatted);
        System.out.println("Tip per person: $" + tipPerPersonFormatted);
        System.out.println("Total bill per person: $" + billPerPersonFormatted);
    }
}
