import java.util.*;

public class DiskSpaceAnalysisOptimizedAgain {

    public static int segment(int x, List<Integer> space) {
        Integer max = Integer.MIN_VALUE;
        for (int computerIndex = 0; computerIndex <= space.size()-x; computerIndex++) {
            List<Integer> segment = space.subList(computerIndex, computerIndex+x);
            Integer segmentMin = Collections.min(segment);
            if (segmentMin > max) {
                max = segmentMin;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> pcs = new ArrayList<>();
        pcs.add(5);
        pcs.add(2);
        pcs.add(5);
        pcs.add(4);
        pcs.add(6);
        pcs.add(8);

        System.out.println(segment(3, pcs));
    }
}
