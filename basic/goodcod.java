package basic;

import java.util.List;
import java.util.function.Predicate;

public class goodcod {
    public static int sum_by_test(List<Integer> nums, Predicate<Integer> selector){
        int sum = 0;
        for(int num : nums){
            if(selector.test(num)){
                sum += num;
            }
        }
        return sum;
    }

    public static int sum_by_test_ref(List<Integer> nums, Predicate<Integer> selector){
        return nums.stream()
                   .filter(selector)
                   .mapToInt(Integer::intValue)
                   .sum();
    }

    public static void main(String[] args) {
        System.out.println(sum_by_test(List.of(1, 2, 3, 4, 5), (x) -> x % 2 == 0));
        System.out.println(sum_by_test(List.of(1, 2, 3, 4, 5), (x) -> x % 2 != 0));
    }
}
