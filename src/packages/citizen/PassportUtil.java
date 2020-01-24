package packages.citizen;

public class PassportUtil {
    public String spouseld;

    private PassportUtil() {
       // Закрытый конструктор
    }
   public static void marriageRegistrate (Passport passport1,Passport passport2) {
    passport1.spouseId = passport2.number;
    passport2.spouseId = passport1.number;
    }
}
