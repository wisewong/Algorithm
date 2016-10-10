package wz.datastructure;

import java.util.Stack;

/**
 * MyQueue
 * 两个栈实现一个队列
 *
 * @author wz
 * @date 16/10/10 10:46
 */
public class MyQueue<E> {

    private Stack<E> stackInput;
    private Stack<E> stackOutput;

    public MyQueue(){
        this.stackInput = new Stack<>();
        this.stackOutput = new Stack<>();
    }

    public void enQueue(E e){
        stackInput.push(e);
    }

    public E deQueue(){
        if (stackOutput.size()>0)
            return stackOutput.pop();

        if (stackInput.size()<=0)
            return null;

        while(stackInput.size()>1){
            stackOutput.push(stackInput.pop());
        }
        return stackInput.pop();
    }

}
