package uppgift1;

import javax.swing.*;

public class AddApply {

    public void addPropertiesAddApply(){
        String  youthCenter = JOptionPane.showInputDialog("Vilken fritidsgård vill du söka till?");
        String address = JOptionPane.showInputDialog("Vad är din address?");
        String email = JOptionPane.showInputDialog("Vad är din email?");
        String phone = JOptionPane.showInputDialog("Vad är ditt telefonnummer?");
        String name = JOptionPane.showInputDialog("Vad är ditt namn?");
        String use = JOptionPane.showInputDialog("Vad ska ni använda pengarna till?");
        int amount = Integer.parseInt(JOptionPane.showInputDialog("Hur mycket vill du söka?"));

        Apply apply = new Apply(youthCenter, address, email, phone, name, use, amount);

        String[] send = {String.valueOf(apply),"Apply", youthCenter};
        FileManager.readObjectToFile(send);
        FeedbackYouthCenterIsCreated(apply);
    }

    public void FeedbackYouthCenterIsCreated(Apply apply){

        JOptionPane.showMessageDialog(null,
                "Du har skapat en ansökan med följande uppgifter: " +
                        "\n Namn: "+apply.getYouthCenter()+
                        "\n Address: "+apply.getAddress()+
                        "\n Email: " +apply.getEmail()+
                        "\n Email: " +apply.getPhone()+
                        "\n Ansvarig: "+apply.getName()+
                        "\n Ansvarig: "+apply.getUse()+
                        "\n Ansvarig: "+apply.getAmount());
    }
}
