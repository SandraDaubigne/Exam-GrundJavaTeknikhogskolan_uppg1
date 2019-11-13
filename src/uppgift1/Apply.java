package uppgift1;

import java.io.Serializable;

public class Apply extends YouthCenter implements Serializable {

    //Ärver youthCenter, address, email, phone från YouthCenter klassen

    private String name;
    private String use;
    private int ammount;


    public Apply(String youthcenter, String address, String email, String phone,String name, String use, int ammount ) {
        super.youthCenter = youthcenter;
        super.address = address;
        super.email = email;
        super.phone = phone;
        this.name = name;
        this.use = use;
        this.ammount = ammount;


    }

    public Apply() {

    }

    public void setName(String name) { this.name = name; }

    public void setUse(String use) {
        this.use = use;
    }

    public void setAmmount(int ammount) { this.ammount =ammount; }


    public String getName() { return name; }

    public String getUse() {
        return use;
    }

    public int getAmmount() {
        return ammount;
    }










}
