package uppgift1;

import javax.swing.*;

public class AddApply extends Apply {
    FileManager fileManager = new FileManager();

    public AddApply(String youthcenter, String address, String email, String phone, String name, String use, int ammount) {
        super(youthcenter, address, email, phone, name, use, ammount);
    }

    public AddApply() {
        super();
    }

    public void addPropertiesAddApply(){
        String  youthcenter = JOptionPane.showInputDialog("Vilken fritidsgård vill du söka till?");
        String address = JOptionPane.showInputDialog("Vad är din address?");
        String email = JOptionPane.showInputDialog("Vad är din email?");
        String phone = JOptionPane.showInputDialog("Vad är ditt telefonnummer?");
        String name = JOptionPane.showInputDialog("Vad är ditt namn?");
        String use = JOptionPane.showInputDialog("Vad ska ni använda pengarna till?");
        int ammount = Integer.parseInt(JOptionPane.showInputDialog("Hur mycket vill du söka?"));

        Apply apply = new Apply(youthcenter, address, email, phone, name, use, ammount);

        String path = "Apply";
        String user = name;
        String[] send = {String.valueOf(youthCenter),path, name};
        fileManager.readObjectToFile(send);
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
                        "\n Ansvarig: "+apply.getAmmount());
    }
}
