package uppgift1;


import javax.swing.*;
import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

Login login = new Login();
AddApply addApply = new AddApply();

//Meny

        int meny = Integer.parseInt(JOptionPane.showInputDialog("Vill du (1) Logga in (2) ansöka"));

        switch (meny){
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Du har valt att logga in");
                login.Login();

                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Du har valt att ansöka, tryck på ok för att fortsätta");
                addApply.addPropertiesAddApply();

                break;

        }


//fileManager.readObjectFromFile(youthcenter,);


        //Switcmenyn
        //Vill du
            //Logga in
            //Ansöka

        //Inloggad kan välja
        //Lägg till frididsgård
            //bevilja ansökningar


    }
}
