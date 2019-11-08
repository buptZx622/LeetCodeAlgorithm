package main.java.Easy.String;

/**
 * @author zhuangxu
 * @date 2019/11/8 11:29
 */
public class LeetCode541 {
    public String reverseStr(String s, int k) {
        if(k<=0){
            return s;
        }
        char[] chars = s.toCharArray();
        int i=0;
        if(s.length()>=k){
            for (; i <chars.length ; i+=2*k) {
                swap(chars,i,k);
            }
            //swap(chars,i-2*k,k);  刚开始加了这一行，运行出错一直找不到问题，很智障，这一操作把最后一组又换回去了
            return String.valueOf(chars);
        }else {
            return reverseStr(s,s.length());
        }
    }

    public void swap(char[] chars,int start,int length){
        int left=start;
        int right=start+length>chars.length?chars.length-1:start+length-1;
        for (; left<right ; ) {
            char tmp=chars[right];
            chars[right]=chars[left];
            chars[left]=tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        LeetCode541 leetCode541=new LeetCode541();
        System.out.println(leetCode541.reverseStr("abcdefg",2));
    }
}
