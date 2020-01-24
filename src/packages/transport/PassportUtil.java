package packages.transport;

class PassportUtil {
    private PassportUtil() {
        // Закрытый конструктор
    }
    public static Passport changeOwner (Passport passport,String newOwnerName) {
        Passport passport1 = new Passport();
        passport1.brand = passport.brand;
        passport1.model = passport.model;
        passport1.colour = passport.colour;
        passport1.ownerName = newOwnerName;
        return passport1;
    }
}
