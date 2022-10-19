package array_list_linked_list.my_list_fake;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(5);

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        display(myList);

        myList.add(6);
        display(myList);

        System.out.println(myList.size());

        System.out.println(myList.contains(2));

        System.out.println("---------------------------------");

        myList.remove(2);
        display(myList);
    }

    public static void display(MyList<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.getElements()[i] + ", ");
        }
        System.out.println();
        System.out.println("---------------------------------");
    }
}
