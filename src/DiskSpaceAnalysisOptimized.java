import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiskSpaceAnalysisOptimized {

    public static int segment(int x, List<Integer> space) {
        List<Integer> minAmountSpaceInSegments = new ArrayList<Integer>();
        for (int computerIndex = 0; computerIndex <= space.size()-x; computerIndex++) {
            List<Integer> segment = space.subList(computerIndex, computerIndex+x);
            minAmountSpaceInSegments.add(Collections.min(segment));
        }
        return Collections.max(minAmountSpaceInSegments);
    }

    public static void main(String[] args) {
        List<Integer> pcs = new ArrayList<>();
        pcs.add(1);
        pcs.add(17);
        pcs.add(41);
        pcs.add(58);
        pcs.add(73);

        System.out.println(segment(2, pcs));
    }
}
