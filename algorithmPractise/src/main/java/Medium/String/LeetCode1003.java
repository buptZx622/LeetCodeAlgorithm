package Medium.String;
/**
 * @program: github
 * @description:
 * @author: ZhuangXu
 * @create: 2019-11-17 16:34
 **/


public class LeetCode1003 {
    //不断删除'abc'看是否为空
    public boolean isValid(String S) {
        while(S.contains("abc")){
            S=S.replace("abc","");
        }
        return S.length()==0;
    }

    public static void main(String[] args) {
        String str="aaabc";
        new LeetCode1003().isValid(str);
    }
}
