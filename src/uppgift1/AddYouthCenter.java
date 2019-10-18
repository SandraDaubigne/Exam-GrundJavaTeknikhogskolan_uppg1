package uppgift1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AddYouthCenter {

public static void addYouthCenter(){
    YouthCenter yc = new YouthCenter();

    String name = JOptionPane.showInputDialog("Enter name");
     yc.setName(name);

    String address = JOptionPane.showInputDialog("Enter address");
    yc.setAddress(address);

    String boss = JOptionPane.showInputDialog("Enter boss");
    yc.setBoss(boss);

    String userName = JOptionPane.showInputDialog("Enter Username");
    yc.setUserName(userName);

    String passWord = JOptionPane.showInputDialog("Enter password");
    yc.setPassWord(passWord);

    //Få in alla dessa som index i en array
    String[] youthCenter = {name, address, boss, userName, passWord };

    JOptionPane.showMessageDialog(null,"You have created a new Youthcenter with \n Name: " +name+ "\n Address: "+address+"\n Boss: "+boss+"\n Username: "+userName+"\n Password: " +passWord);
    System.out.println(Arrays.toString(youthCenter));

    //spara sedan den gjorda arrayen i en arraylist för att inte skriva över den nästa gång
    //KVAR ATT GÖRA
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
