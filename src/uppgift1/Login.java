package uppgift1;

import javax.swing.*;

public class Login {

    AddYouthCenter addYouthCenter = new AddYouthCenter();
    FileManager fileManager = new FileManager();

    public boolean LoggedIn(){
        int password = Integer.parseInt(JOptionPane.showInputDialog("Ange ditt lösenord, fyra siffor"));

        if(password ==0000 ) {
            return true;

        } else {
            return false;
        }



    }
}
