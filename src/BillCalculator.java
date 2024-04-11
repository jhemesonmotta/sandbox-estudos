import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BillCalculator {

    public static void main(String[] args) {
        List<Integer> billItems = new ArrayList<>();
        billItems.add(3);
        billItems.add(10);
        billItems.add(2);
        billItems.add(9);

        bonAppetit(billItems, 1, 12);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int anasBill = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                anasBill = anasBill + bill.get(i);
            }
        }

        anasBill = anasBill / 2;

        if (anasBill == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - anasBill);
        }
    }
}
