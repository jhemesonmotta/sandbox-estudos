import java.util.ArrayList;
import java.util.List;

class Result {
    public static int segment(int x, List<Integer> space) {
        List<Integer> minAmountSpaceInSegments = new ArrayList<Integer>();

        for (int computerIndex = 0; computerIndex <= space.size()-x; computerIndex++) {
            List<Integer> segment = space.subList(computerIndex, computerIndex+x);

            Integer minSpaceAmount = Integer.MAX_VALUE;

            for (Integer diskSpace: segment) {
                if (diskSpace < minSpaceAmount) {
                    minSpaceAmount = diskSpace;
                }
            }

            minAmountSpaceInSegments.add(minSpaceAmount);
        }

        Integer maxSpaceAmount = Integer.MIN_VALUE;

        for (Integer diskSpace: minAmountSpaceInSegments) {
            if (diskSpace > maxSpaceAmount) {
                maxSpaceAmount = diskSpace;
            }
        }

        return maxSpaceAmount;
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
