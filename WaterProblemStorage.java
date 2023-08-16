import java.util.*;

public class WaterProblemStorage {

    public static double StorageWater(ArrayList<Integer> height) { // changed return type to double
        double maxWater = -1;
        double lp = 0;
        double rp = height.size() - 1;
        while (lp < rp) {
            double ht = Math.min(height.get((int) lp), height.get((int) rp)); // cast double to int
            double width = rp - lp;
            double currWater = ht * width;
            maxWater = Math.max(currWater, maxWater);
            if (height.get((int) lp) < height.get((int) rp)) { // cast double to int
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the height array list that is the number of containers: ");
        int n = sc.nextInt(); // changed to int
        ArrayList<Integer> height = new ArrayList<>();
        System.out.println("enter the heights of the columns");
        for (int i = 0; i < n; i++) {
            height.add(sc.nextInt());
        }
        System.out.println("the maximum water that can be stored in the containers is " + StorageWater(height)); // added newline
    }
}