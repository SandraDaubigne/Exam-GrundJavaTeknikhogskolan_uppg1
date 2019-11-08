package uppgift1;

import java.io.Serializable;

public class Apply implements Serializable {

  private String youthcenter;
  private String use;
  private int ammount;
  private String name;
  private String phonenumber;
  private String address;
  private String email;

    public Apply(String youthcenter, String use,  int ammount , String name, String phonenumber, String address, String email) {
        this.youthcenter = youthcenter;
        this.use = use;
        this.ammount = ammount;
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.email = email;
    }



    public String getYouthcenter() {
        return youthcenter;
    }

    public String getUse() {
        return use;
    }

    public int getAmmount() {
        return ammount;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setYouthcenter(String youthcenter) {
        this.youthcenter = youthcenter;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public void setAmmount(int ammount) {
        this.ammount =ammount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
