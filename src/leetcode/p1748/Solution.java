package leetcode.p1748;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;

class Solution {
    public int sumOfUnique(int[] nums) {
// nums 를 전체 탐색해서 각 아이템이 몇 번 나오는지 세기
       /*    Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (map.containsKey(n)) {
                // n이 map에 있으면
                Integer v = map.get(n);
                map.put(n, v + 1);
            } else {
                // n이 map에 없으면
                map.put(n, 1);
            }
        }

        int sum = 0;
        // map을 전체 탐색해서 value가 1인 key들을 더하기
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }


        // 결과 return
        return sum; */

        int r1 = 0;

        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()));


        map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .mapToInt(Integer::intValue).sum();


        return 0;
    }
}
