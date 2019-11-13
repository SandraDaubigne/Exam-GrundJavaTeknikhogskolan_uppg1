package uppgift1;

import javax.swing.*;


public class AddYouthCenter {
    //ligger här för att jag vill inte att en ny arraylist skapas varje gång metoden under körs
    //lila betyder att det är en klassvariabel
    FileManager fileManager = new FileManager();


    public void addPropertiesNewYouthCenter(){
        String youthCenter = JOptionPane.showInputDialog("Vad heter fritidsgården du vill lägga till?");
        String address = JOptionPane.showInputDialog("Vad är det för address dit? ");
        String email = JOptionPane.showInputDialog("Vilke email ska vara kopplad till denna fritidsgård?");
        String phone = JOptionPane.showInputDialog("Vad är det för telefonnummer till fritidsgården?");
        String headOfDepartment = JOptionPane.showInputDialog("Vem kommer vara ansvarig?");
        String userName = JOptionPane.showInputDialog("Välj ett användanamn");
        String passWord = JOptionPane.showInputDialog("Välj ett lösenord");

        YouthCenter addYouthCenter = new YouthCenter(youthCenter, address, email, phone, headOfDepartment, userName, passWord );
        String path = "youthcenter";
        String user = youthCenter;
        String[] send = {String.valueOf(addYouthCenter),path, user};

        //gjorde att denna metod skickar med en array till readTo Object så att
        // tex apply kan använda samma metod sen med.
        fileManager.readObjectToFile(send);
        FeedbackYouthCenterIsCreated(addYouthCenter);
}

public void FeedbackYouthCenterIsCreated(YouthCenter center){

   JOptionPane.showMessageDialog(null,
           "Du har skapat en fritidsgård med följande uppgifter: " +
            "\n Namn: "+center.getYouthCenter()+
            "\n Address: "+center.getAddress()+
                   "\n Email: " +center.getEmail()+
           "\n Ansvarig: "+center.getHeadOfDepartment()+
           "\n Användarnamn: "+center.getUserName()+
           "\n Lösenord: "+center.getPassWord());
}


}
