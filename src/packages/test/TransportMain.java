package packages.test;

import packages.transport.Passport;
// import packages.transport.PassportUtil;


public class TransportMain {
    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.ownerName = "Vlad";
        // PassportUtil.changeOwner(passport,"Lena");
        Passport passport1 = passport.changeOwner("Volodymyr");
    }
}
