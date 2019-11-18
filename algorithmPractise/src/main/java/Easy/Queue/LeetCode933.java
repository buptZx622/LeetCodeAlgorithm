package main.java.Easy.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhuangxu
 * @date 2019/11/18 18:01
 */
public class LeetCode933 {
    Queue<Integer> queue;
    public LeetCode933() {
        queue=new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        int count=0;
        while(!queue.isEmpty()){
            //一开始每次来都遍历，时间复杂度极高，后来改成这种及时更新的思路
            Integer peek = queue.peek();
            if(peek<t-3000){
                queue.poll();
            }else {
                break;
            }
        }
        return queue.size();
    }
}
