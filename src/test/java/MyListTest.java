public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(5);
        myList.add(0, 11);
        myList.add(1, 22);
        myList.add(2, 33);
        myList.add(3, 44);
        myList.remove(3);
        myList.add(3,55);

        System.out.println("My List now is: ");
        for (int i = 0; i < myList.size; i++) {
            System.out.print("\t" + myList.elements[i]);
        }

        System.out.println("\n" + "Element at index 2 is: " + myList.get(2));

        System.out.println("is element 33 added to My list? " + myList.add(33));

        System.out.println("Index of element 22 is: " + myList.indexOf(22));

        System.out.println("Size of My list is: " + myList.getSize());

        myList.clear();
        System.out.println("My List after clear is: ");
        for (int i = 0; i < myList.size; i++) {
            System.out.println(myList.elements[i]);
        }


    }
}
