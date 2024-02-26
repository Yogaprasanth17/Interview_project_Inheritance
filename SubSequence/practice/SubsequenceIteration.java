package SubSequence.practice;

import java.util.*;

public class SubsequenceIteration {

    public static void main(String[] args) {
        SubsequenceIteration subsequenceIteration = new SubsequenceIteration();
        // int[] nums = {1,2,3};
        int[] nums = {1,2,2};
        List<List<Integer>> ans = subsequenceIteration.subIterationDup(nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public List<List<Integer>> subIteration(int[] nums) {
        List<List<Integer>> outterList = new ArrayList<>();
        outterList.add(new ArrayList<>());

        for (int num : nums) {
            int n = outterList.size();
            for (int i = 0; i < n; i++) {
                List<Integer> innerList = new ArrayList<>(outterList.get(i));
                innerList.add(num);
                outterList.add(innerList);
            }
        }

        return outterList;
    }
    public List<List<Integer>> subIterationDup(int[] nums) {
        List<List<Integer>> outterList = new ArrayList<>();
        outterList.add(new ArrayList<>());
        int s = 0,e = 0;

        for (int i=0;i<nums.length;i++) {
            s = 0;
            if (i > 0 && nums[i] == nums[i-1]) {
                s = e + 1; 
            }
            e = outterList.size() - 1;
            int n = outterList.size();
            for (int j = s; j < n; j++) {
                List<Integer> innerList = new ArrayList<>(outterList.get(j));
                innerList.add(nums[i]);
                outterList.add(innerList);
            }
        }
        
        return outterList;
    }
}
