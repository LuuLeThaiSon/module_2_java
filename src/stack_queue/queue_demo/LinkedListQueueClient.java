package stack_queue.queue_demo;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();

        myLinkedListQueue.enqueue(1);
        myLinkedListQueue.enqueue(2);
        myLinkedListQueue.enqueue(100);
        myLinkedListQueue.dequeue();
        myLinkedListQueue.dequeue();
        myLinkedListQueue.enqueue(4);
        myLinkedListQueue.enqueue(5);
        myLinkedListQueue.enqueue(6);

        System.out.println("Dequeued item is " + myLinkedListQueue.dequeue().key);

    }
}
