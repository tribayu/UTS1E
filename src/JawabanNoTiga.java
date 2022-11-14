import java.util.Random;
import java.util.Scanner;

public class JawabanNoTiga {

    int jumvaksin = 3; //pfizer,sinopharm,moderna
    static int totaljumlahpenerimavaksin = 12;
    public static String[] pfizer = new String[4];
    public static String[] sinopharm = new String[4];
    public static String[] moderna = new String[4];

    public static void printlnfovaksin() {
        int totalpfizer = 0;
        int totalsisakuota = 0;
        for (int index = 0; index < pfizer.length; index++) {
            if (pfizer[index] != null) {
                totalpfizer++;
            }
        }
        int totalsinopharm = 0;
        for (int index = 0; index < sinopharm.length; index++) {
            if (sinopharm[index] != null) {
                totalsinopharm++;
            }
        }
        int totalmoderna = 0;
        for (int index = 0; index < moderna.length; index++) {
            if (moderna[index] != null) {
                totalmoderna++;
            }
        }
        totalsisakuota = totaljumlahpenerimavaksin - totalpfizer - totalsinopharm - totalmoderna;
        System.out.println("total pasien pfizer:" + totalpfizer + " | total pasien sinopharm:" + totalsinopharm + " | total pasien moderna: " + totalmoderna);
        System.out.println("jumlah seluruh vaksin : " + totaljumlahpenerimavaksin + " | total sisa kuota: " + totalsisakuota);
        System.out.println();

    }

    public static void Checkindexarray(String[] myarray, String pasien) {
        int indexNow = 0;
        for (int index = 0; index < myarray.length; index++) {
            if (myarray[index] != null) {
                indexNow = index + 1;
            }
        }
        if (indexNow < myarray.length) {
            myarray[indexNow] = pasien;
        }
    }

    public static void simpanpasien(int angkaRandom, String pasien) {
        switch (angkaRandom) {
            case 1:
                Checkindexarray(pfizer, pasien);
                System.out.println("anda mendapat vaksin pfizer");
                printlnfovaksin();
                break;
            case 2:
                Checkindexarray(sinopharm, pasien);
                System.out.println("anda mendapat vaksin sinopharm");
                printlnfovaksin();
                break;
            case 3:
                Checkindexarray(moderna, pasien);
                System.out.println("anda mendapat vaksin moderna");
                printlnfovaksin();
                break;

        }
    }

    public static void inputpasien(){
        Scanner inputdata = new Scanner(System.in);
        while(true){
            System.out.println("nama pasien = ");
            String namapasien = inputdata.nextLine();
            if(namapasien.isBlank()){
            System.out.println("nama pasien wajib diisi ");
            inputpasien();
        }else{
            Random hasilrandom = new Random();
            int jenisrandom = hasilrandom.nextInt(3)+1;
            simpanpasien(jenisrandom,namapasien);

            }

        }

    }
    public static void main(String[] args){
        inputpasien();

    }

    }






