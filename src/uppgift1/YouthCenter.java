package uppgift1;
//Denna klass representerar objektet fritidsgård och dess attributer

public class YouthCenter {

    private String name;
    private String address;
    private String boss;
    private String userName;
    private String passWord;

    public YouthCenter() {

    }

    public YouthCenter(String name, String address, String boss, String userName, String passWord, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.boss = boss;
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBoss() {
        return boss;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }


}
