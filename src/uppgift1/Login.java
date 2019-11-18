package uppgift1;

import javax.swing.*;

public class Login {

    public void Login(){

        AddYouthCenter addYouthCenter = new AddYouthCenter();
        FileManager fileManager = new FileManager();

        int password = Integer.parseInt(JOptionPane.showInputDialog("Ange ditt lösenord, fyra siffor"));

        if(password ==0000 ){
            int meny = Integer.parseInt(JOptionPane.showInputDialog("Du är nu inloggad. Vill du (1) Lägga till fritidsgård (2) läsa ansökningar"));

            switch (meny){
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

        }
    }
}
