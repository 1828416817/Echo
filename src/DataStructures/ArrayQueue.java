package DataStructures;

public class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    //创建队列的构造器
    public ArrayQueue(int ArrayMaxSize) {
        maxSize = ArrayMaxSize;
        front = -1;
        rear = -1;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满，不能加入数据");
        }else {
            rear++;
            arr[rear]=n;
        }
    }
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空，不能获取数据");
        }else {
            front++;
            return arr[front];
        }
    }
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列空，没有数据");
        }else {
            for (int i = 0; i <arr.length ; i++) {
                System.out.printf("arr[%d]=%d\n",i,arr[i]);

            }
        }
    }
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列空，没有收据");
        }else {
            return arr[front+1];
        }
    }

}


