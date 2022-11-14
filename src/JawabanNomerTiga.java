public class JawabanNomerTiga {
    int JumlahBusPariwisata = 04; //TopLevel,MiddleLevel,RegularStaff,Staff
    static int totaljumlahanggota = 100;
    public static String[] TopLevel = new String[25];
    public static String[] MiddleLevel = new String[25];
    public static String[] RegularStaff = new String[25];
    public static String[] Staff = new String[25];

    public static void infoBusPariwisata() {
        int totalTopLevel = 0;
        int totalBusPariwisata = 0;
        for (int index = 0; index < TopLevel.length; index++) {
            if (TopLevel[index] != null) {
                totalTopLevel++;
            }
        }
        int totalMiddleLevel = 0;
        for (int index = 0; index < MiddleLevel.length; index++) {
            if (MiddleLevel[index] != null) {
                totalMiddleLevel++;
            }
        }
        int totalRegularStaff = 0;
        for (int index = 0; index < RegularStaff.length; index++) {
            if (RegularStaff[index] != null) {
                totalRegularStaff++;
            }
        }
        int totalStaff = 0;
        for (int index = 0; index < Staff.length; index++) {
            if (Staff[index] != null) {
                totalStaff++;
            }
        }
        totalBusPariwisata = totaljumlahanggota - totalTopLevel - totalMiddleLevel - totalRegularStaff - totalStaff;
        System.out.println();
    }
}