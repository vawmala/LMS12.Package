package packages.test;

import packages.citizen.Passport;
import static packages.citizen.PassportUtil.*;


public class CitizenMain {
    public static void main(String[] args) {
        Passport husband = new Passport();
        Passport wife = new Passport();
        husband.number = "СВ999875";
        wife.number = "СВ975875";
        marriageRegistrate(husband,wife);
        System.out.println(husband.spouseId);
        System.out.println(wife.spouseId);
    }
}
