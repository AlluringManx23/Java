import javax.swing.*;

public class Q1 {
    public static void main(String[] args) {
        String name,group,snackAsString;
        int snack, snackCost;
        name = JOptionPane.showInputDialog(null,"Please enter your name","Name: ");
        group = JOptionPane.showInputDialog(null,"Please enter class name","Class name: ");
        snackAsString = JOptionPane.showInputDialog(null,"How many snack deals do you want","How Many: ");
        snack = Integer.parseInt(snackAsString);
        snackCost = snack * 2;
        JOptionPane.showMessageDialog(null,"Your name is " + name + "\nYou're in class " + group + "\nYou want " + snack + " snack deal(s)\nWhich will cost you €" + snackCost, "Information", 1);
    }
}