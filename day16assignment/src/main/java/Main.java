public class Main {
    public static void main(String args[]) {

        myLinkedList list = new myLinkedList();
        list.add(56);
        list.add(70);
        list.insertAt(1, 30);

        list.show();
    }
}
