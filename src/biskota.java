import java.util.ArrayList;

public class biskota {
    public static void main(String[] args) {
        ArrayList<int[]> stopgo = new ArrayList<int[]>();

        stopgo.add(new int[]{10,0});
        stopgo.add(new int[]{3,5});
        stopgo.add(new int[]{2,5});

        System.out.println(getpassenger(stopgo));
    }

    public static int getpassenger(ArrayList<int[]> BisKota) {
        int result = 0;
        for (int i=0; i<BisKota.size(); i++) {
            for (int j=0; j<BisKota.get(i).length ; j++) {
                if (BisKota.get(i)[j] == BisKota.get(i)[0]) {
                    result+=BisKota.get(i)[j];
                } else {
                    result-=BisKota.get(i)[j];
                }
            }
        }
        return result;
    }
}
