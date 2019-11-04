package main.java.Medium.Array;

import java.util.Arrays;

/**
 * @author zhuangxu
 * @date 2019/11/4 16:45
 * leetcode 950 按递增顺序显示卡牌 https://leetcode-cn.com/problems/reveal-cards-in-increasing-order/
 *  理解题意 将数组排序，进行一下逆操作
 */
public class LeetCode950 {

    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] res=new int[deck.length];
        res[0]=deck[deck.length-1];
        int length=1;
        for (int i = deck.length-2; i >=0 ; i--) {
            if(length==1){
                res[1]=res[0];
            }else {
                adjustmentArray(res,length);
            }
            res[0]=deck[i];
            length++;
        }
        return res;
    }
    public static void adjustmentArray(int[] array,int right){
        int tmp=array[right-1];
        System.arraycopy(array,0,array,2,right-1);
        array[1]=tmp;
    }//感觉会有更好的方法，大家可以思考一下，这里是每一次都进行了一次移动

}
