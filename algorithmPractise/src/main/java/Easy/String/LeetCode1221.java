package Easy.String;
/**
 * @program: github
 * @description:
 * @author: ZhuangXu
 * @create: 2019-11-17 15:36
 **/


public class LeetCode1221 {

    public int balancedStringSplit(String s) {
        int[] count=new int[2];
        //count[0]记录L数量 count[1]记录R数量
        char[] chars = s.toCharArray();
        int maxCount=0;
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]=='L'){
                count[0]++;
            }else {
                count[1]++;
            }
            if(count[0]==count[1]) {
                maxCount++;
                count[0]=0;
                count[1]=0;
            }
        }
        return maxCount;
    }
}
