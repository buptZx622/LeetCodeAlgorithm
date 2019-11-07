package main.java.Easy.Stack;

import java.util.Stack;

/**
 * @author zhuangxu
 * @date 2019/11/5 14:42
 * 栈实现队列，很经典的题目，基本上属于刷题入门必
 * 只能使用栈一种数据结构
 */
public class LeetCode232 {
    Stack<Integer> stack0;
    Stack<Integer> stack1;
    public LeetCode232() {
         stack0=new Stack<>();
         stack1=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack1.isEmpty()){
            while(!stack0.isEmpty()){
                stack1.push(stack0.pop());
            }
            stack0.push(x);
            while(!stack1.isEmpty()){
                stack0.push(stack1.pop());
            }
        }else{
            while(!stack1.isEmpty()){
                stack0.push(stack1.pop());
            }
            stack1.push(x);
            while(!stack0.isEmpty()){
                stack1.push(stack0.pop());
            }
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack1.isEmpty()?stack0.pop():stack1.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack1.isEmpty()?stack0.peek():stack1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack0.isEmpty()&&stack1.isEmpty();
    }
}
