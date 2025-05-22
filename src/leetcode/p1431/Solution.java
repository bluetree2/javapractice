package leetcode.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b = new ArrayList<>();
//        int max = 0;

//        for (int i = 0; i < candies.length; i++) {
//            if (candies[i] > max)
//                max = candies[i];
//        }
//
//        for (int i = 0; i < candies.length; i++) {
//            if (candies[i] + extraCandies >= max) {
//                b.add(true);
//                // b[i] = true;
//            } else {
//                b.add(false);
//                // b[i] = false;
//            }
//
//        }

        int max = Arrays.stream(candies)
                .max()
                .orElse(0);

        return Arrays.stream(candies)
                .map(s -> s + extraCandies)
                .mapToObj(s -> s >= max)
                .toList();

    }
}
