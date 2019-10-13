import javax.swing.*;

public class Q2 {
    public static void main(String[] args) {
        String distanceAsString,firstName,initials,lastName;
        int distance;
        final double under10km = 0.07, over10km = 0.10;
        double totalDue;
        firstName = JOptionPane.showInputDialog(null,"Please enter your First name","First name: ");
        initials = JOptionPane.showInputDialog(null,"Please enter your middle initials","middle initials: ");
        lastName = JOptionPane.showInputDialog(null,"Please enter your Last name","Last name: ");
        distanceAsString = JOptionPane.showInputDialog(null,"Please enter how far you cycled(in Kilometers)","Distance: ");
        distance = Integer.parseInt(distanceAsString);
        if(distance<=10)
        {
            totalDue = distance*under10km;
            JOptionPane.showMessageDialog(null,"Your name is " + firstName + " " + initials + ". " + lastName + "\nYou cycled " + distance +"km\nYour Due €" + (String.format("%.2f",totalDue)), "Information", 1);
        }
        else
        {
            totalDue = (((distance-10)*over10km)+0.7);
            JOptionPane.showMessageDialog(null,"Your name is " + firstName + " " + initials + ". " + lastName + "\nYou cycled " + distance +"km\nYour Due €" + (String.format("%.2f",totalDue)), "Information", 1);
        }
    }
}
