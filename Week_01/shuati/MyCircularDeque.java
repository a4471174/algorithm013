package shuati;

/**
  双端队列
    作者: liweiwei1419

    1. 定义循环 变量 front 和 rear
       front: 队列头部第一个有效数据位置
       rear: 队列尾部下一个位置

    2. 为避免“队列为空”和“队列为满”的判别条件冲突，有意浪费一个位置。
       有意浪费一个位置：循环数组中任何时刻一定至少有一个位置不存放有效元素。
       判别队列为空的条件是：front == rear;；
       判别队列为满的条件是：(rear + 1) % capacity == front;。

    3. 因为有循环的出现，要特别注意处理数组下标可能越界的情况。
      （1）指针后移的时候，索引 + 1，要取模；
      （2）指针前移的时候，为了循环到数组的末尾，需要先加上数组的长度，然后再对数组长度取模。
*/
public class MyCircularDeque {

    private int[] arr;
    private int capacity;
    private int front;
    private int rear;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        front = 0;
        rear = 0;

        capacity = k + 1;

        arr = new int[capacity];
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        front = (front -1 + capacity) % capacity;
        arr[front] = value;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
         if(isFull()){
            return false;
        }
        arr[rear] =value;
        rear = (rear + 1) % capacity; 
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front +1) % capacity;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear -1 + capacity) % capacity;
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[(rear - 1 + capacity) % capacity];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}


/**
 * Your shuati.MyCircularDeque object will be instantiated and called as such:
 * shuati.MyCircularDeque obj = new shuati.MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */