package packages.test;

import packages.technics.Passport;
import packages.technics.PassportUtil;

public class TechnicsMain {
    public static void main(String[] args) {
        Passport passport = new Passport();
        PassportUtil.warrantyReplace(passport);
    }
}
