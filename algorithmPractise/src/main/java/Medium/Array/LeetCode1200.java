package main.java.Medium.Array;

import java.util.*;

/**
 * @author zhuangxu
 * @date 2019/12/24 10:13
 */
public class LeetCode1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        if(arr.length==0||arr.length==1) {
            return res;
        }
        Arrays.sort(arr);
        Map<Integer,String> map=new HashMap<>();
        int min=arr[1]-arr[0];
        map.put(min,"0");
        for (int i = 1; i < arr.length-1; i++) {
            int diff=arr[i+1]-arr[i];
            if(diff>min){
                continue;
            }else if(diff==min){
                String indexs=map.get(min);
                indexs+=","+i;
                map.put(min,indexs);
            }else{
                map.remove(min);
                min=diff;
                map.put(min,i+"");
            }
        }
        String indexs=map.get(min);
        String[] strings = indexs.split(",");
        for (int i = 0; i < strings.length; i++) {
            List<Integer> list=new ArrayList<>();
            list.add(arr[Integer.parseInt(strings[i])]);
            list.add(arr[Integer.parseInt(strings[i])+1]);
            res.add(list);
        }
        return res;
    }
}
