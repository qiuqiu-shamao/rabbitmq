package com.itheima.rabbitmq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, -6,-5,-4,-2,-3,0,16, 1, 8, 2, 7,-1};
        List<Integer> list = new ArrayList<>();

        String arrA = "";
        String arrB = "";

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int b = nums[j];
                if (a + b == 9) {
                    arrA += "" + a + b;
                    arrB = "" + b + a;

                    if (arrA.contains(arrB)) {
                        continue;
                    }

                    list.add(a);
                    list.add(b);
                    System.out.println(list);
                    list = new ArrayList<>();
                }

            }

        }


        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length - 1; i1++) {
                if (nums[i1] > nums[i1 + 1]) {
                    temp = nums[i1 + 1];
                    nums[i1 + 1] = nums[i1];
                    nums[i1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));


    }

}
