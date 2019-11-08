package uppgift1;

import javax.swing.*;

public class AddApply {

    public void addPropertiesAddApply(){
        String  youthcenter = JOptionPane.showInputDialog("Vilken fritidsgård vill du söka till?");
        String use = JOptionPane.showInputDialog("Vad ska ni använda pengarna till?");
        int ammount = Integer.parseInt(JOptionPane.showInputDialog("Hur mycket vill du söka?"));
        String name = JOptionPane.showInputDialog("Vad är ditt namn?");
        String phonenumber = JOptionPane.showInputDialog("Vad är ditt telefonnummer?");
        String address = JOptionPane.showInputDialog("Enter Username");
        String email = JOptionPane.showInputDialog("Enter password");

        Apply apply = new Apply(youthcenter,use,ammount,name,phonenumber,address,email);
    }
}
