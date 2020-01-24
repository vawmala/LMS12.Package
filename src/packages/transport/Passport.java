package packages.transport;

public class Passport {
    public String brand;
    public String model;
    public String colour;
    public String ownerName;


    public Passport changeOwner (String ownerName) {
       return PassportUtil.changeOwner(this,ownerName);
    }

}
