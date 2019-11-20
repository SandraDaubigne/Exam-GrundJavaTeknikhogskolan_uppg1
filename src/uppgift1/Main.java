package uppgift1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

Login login = new Login();
AddApply addApply = new AddApply();
AddYouthCenter addYouthCenter = new AddYouthCenter();
FileManager fileManager = new FileManager();

        int meny = Integer.parseInt(JOptionPane.showInputDialog("Vill du (1) Logga in (2) ansöka"));

        switch (meny){
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Du har valt att logga in");
                boolean logged = login.LoggedIn();
                if(logged == true){
                    int choise = Integer.parseInt(JOptionPane.showInputDialog("Du är nu inloggad. Vill du (1) Lägga till fritidsgård (2) läsa ansökningar"));
                    switch (choise){
                        case 1:
                            JOptionPane.showMessageDialog(null,
                                    "Du har valt att Lägga till fritidsgård, klicka på ok för att fortsätta");
                            addYouthCenter.addPropertiesNewYouthCenter();
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,
                                    "Du har valt att läsa ansökningar, tryck ok för att fortsätta");
                            fileManager.readObjectFromFile("apply","sandra");
                            break;
                    }


                }if(logged == false){
                JOptionPane.showMessageDialog(null,
                        "Du har angivit fel lösenord, tryck på ok för att försöka en gång till");
                login.LoggedIn();
            }
                break;

            case 2:
                JOptionPane.showMessageDialog(null,
                        "Du har valt att ansöka, tryck på ok för att fortsätta");
                addApply.addPropertiesAddApply();

                break;

        }


    }
}
