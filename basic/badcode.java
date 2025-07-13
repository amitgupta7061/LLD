package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class badcode {

    public static int sum(List<Integer> nums){
        int sum = 0;
        for(var it : nums) sum += it;
        return sum;
    }

    public static int even_sum(List<Integer> nums){
        int sum = 0;
        for(var it : nums) if(it % 2 == 0) sum += it;
        return sum;
    }

    public static int odd_sum(List<Integer> nums){
        int sum = 0;
        for(var it : nums) if(it % 2 != 0) sum += it;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            nums.add(num);
        }

        System.out.println(sum(nums));

        sc.close();
    }
    
}