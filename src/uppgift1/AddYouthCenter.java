package uppgift1;

import javax.swing.*;
import java.util.ArrayList;

public class AddYouthCenter {

public static void addYouthCenter(){
    YouthCenter yc = new YouthCenter();

    //Sedan få in alla arrayerna i listan som index
    ArrayList<YouthCenter> youthCenters = new ArrayList<YouthCenter>();

    //Få in alla dessa som index i en array
    String name = JOptionPane.showInputDialog("Enter name");
     yc.setName(name);
    System.out.println(yc.getName());

    String address = JOptionPane.showInputDialog("Enter address");
    yc.setAddress(address);
    System.out.println(yc.getAddress());

}




    //Denna klass ska kunna skapa nya fritidsgårdars värde i en Array
    // som ska läggas i en arrayList och sedan kunna hämtas i menyerna.

//Tillverka något som skapar ett nytt  objekt av klassen Youthcenter varje gång användaren väljer "lägg till ny fritidsgård"
//Skapa en array som tar in värdena: Namn, Adress, Telefonnummer, Ansvarig, Login, Password och lägger i klassen YouthCenter.
//Arrayens värde hämtas genom inmating från användaren.
//Spara hela arrayen som ett index i en arraylist



//Skapa en string array som heter lägg till firtidsgård. Omvandra till parseint på telefonnummer
//skapa en arraylist dom heter fritidsgårdar.


//Skapa en metod som heter add new youth center
//Inne i den en forloop som sparar värdena från inmatningen
//Och som lägger till
}
