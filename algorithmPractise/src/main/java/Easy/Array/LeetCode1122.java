package main.java.Easy.Array;

import java.util.*;

/**
 * @author zhuangxu
 * @date 2019/11/14 15:44
 */
public class LeetCode1122 {

    /**
     * 写的无比垃圾
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> numCount=new HashMap<>();
        for (int i = 0; i < arr1.length ; i++) {
            numCount.put(arr1[i],numCount.getOrDefault(arr1[i],0)+1);
        }
        int[] res=new int[arr1.length];
        int index=0;
        for (int i = 0; i <arr2.length ; i++) {
            if(numCount.containsKey(arr2[i])){
                int count=numCount.get(arr2[i]);
                numCount.remove(arr2[i]);
                while(count>0){
                    res[index++]=arr2[i];
                    count--;
                }
            }
        }
        Set<Integer> integers = numCount.keySet();
        TreeSet<Integer> sortSet=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        sortSet.addAll(numCount.keySet());
        for (Integer val:sortSet) {
            int count=numCount.get(val);
            while(count>0){
                res[index++]=val;
                count--;
            }
        }
        return res;
    }
}
