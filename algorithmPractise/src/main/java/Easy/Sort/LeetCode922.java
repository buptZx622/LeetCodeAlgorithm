package main.java.Easy.Sort;

/**
 * @author zhuangxu
 * @date 2019/11/5 14:16
 * 按照奇偶排序树组 https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 * 题目很简单，奇数下标为奇数，偶数下标为偶数
 */
public class LeetCode922 {
    public int[] sortArrayByParityII(int[] A) {
        int ou=0;
        int ji=1;
        for (; ji<A.length ;) {
            while(ou<A.length-1&&A[ou]%2==0){
                ou=ou+2;
            }
            while(ji<A.length&&A[ji]%2==1){
                ji=ji+2;
            }
            if(ou<A.length-1)//如果 偶数下标到头 没问题，那么奇数下标的数也肯定没有问题
                swap(A,ji,ou);
        }
        return A;
    }

    public void swap(int[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
