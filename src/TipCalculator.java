public class TipCalculator {
    private double totalBill;
    private int tip;
    private int numOfPeople;

    public TipCalculator(double totalBill, int tip, int numOfPeople) {
        this.totalBill = totalBill;
        this.tip = tip;
        this.numOfPeople = numOfPeople;
    }

    public double convertTip() {
        double tipPercentage = tip / 100.0;
        return tipPercentage;
    }

    public double calculateTipAmount() {
        double tipAmount = Math.round(totalBill * convertTip() * 100.0) / 100.0;
        return tipAmount;
    }

    public double calculateBillWithTip() {
        double billWithTip = calculateTipAmount() + totalBill;
        return billWithTip;
    }

    public double calculateTipPerPerson() {
        double tipPerPerson = Math.round(calculateTipAmount() / numOfPeople * 100.0) / 100.0;
        return tipPerPerson;
    }

    public double calculateBillPerPerson() {
        double totalBillPerPerson = Math.round(calculateBillWithTip() / numOfPeople * 100.0) / 100.0;
        return totalBillPerPerson;
    }
}
