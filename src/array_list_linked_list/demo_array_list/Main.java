package array_list_linked_list.demo_array_list;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        display(myList);

        System.out.println(myList.get(2));
    }

    public static void display(MyList<Integer> myList) {
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.print(myList.getElements()[i] + ", ");
        }
        System.out.println();
    }
}
