package array_list_linked_list.demo_linked_list;

public class TestMyLinkList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(6);

        myLinkedList.printList();

        myLinkedList.add(2, 100);
        myLinkedList.printList();

        myLinkedList.add(8,100); //add vào vị trí lớn hơn size mảng
        myLinkedList.printList(); //kết quả: chèn vào vị trí cuối cùng của mảng
    }
}
