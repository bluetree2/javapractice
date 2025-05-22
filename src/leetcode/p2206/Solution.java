package leetcode.p2206;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class Solution {
    public boolean divideArray(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();

        /* for (int n : nums) {
            if (map.containsKey(n)) {
                // n이 map에 있으면
                Integer v = map.get(n);
                map.put(n, v + 1);
            } else {
                // n이 map에 없으면
                map.put(n, 1);
            }
        }

         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return false;
            }
        } */

        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()));

        return map.values()
                .stream()
                .allMatch(e -> e % 2 == 0);


//        return true;
    }
}
