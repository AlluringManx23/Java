import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        String name,taxIncomeAsString;
        double taxIncome,net=0,taxDue=0,taxable;
        int lowTax = 20,highTax = 41,highTaxAddition = 7200;
        name = JOptionPane.showInputDialog(null,"Please enter your First name","name: ");
        taxIncomeAsString = JOptionPane.showInputDialog(null,"Please enter your taxable income","Taxable Income: ");
        taxIncome = Double.parseDouble(taxIncomeAsString);
        if(taxIncome<=20000.00)
        {
            JOptionPane.showMessageDialog(null,"Your name is " + name + "\nYou are not being taxed\nYou have €" + (String.format("%.2f",taxIncome)) + " takehome pay", "Information", 1);
        }
        else if(36000.00>=taxIncome && taxIncome>=20000.01)
        {
            taxable = taxIncome-20000;
            taxDue = ((taxable/100)*lowTax);
            net = taxIncome - taxDue;
            JOptionPane.showMessageDialog(null,"Your name is " + name + "\nEverything over €20,000 is being taxed at %" + lowTax + "You owe €" + taxDue + "\nYou have €" + (String.format("%.2f",net)) + " takehome pay", "Information", 1);
        }
        else if(36000.01<=taxIncome)
        {
            taxable = taxIncome-36000;
            taxDue = ((taxable/100)*highTax);
            taxDue = taxDue+highTaxAddition;
            net = taxIncome - taxDue;
            JOptionPane.showMessageDialog(null,"Your name is " + name + "\nEverything over €20,000 is being taxed at %" + highTax + "\nYou owe €" + taxDue + "\nYou have €" + (String.format("%.2f",net)) + " takehome pay", "Information", 1);
        }
    }
}
