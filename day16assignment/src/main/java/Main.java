public class Main {
    public static void main(String args[]) {

        myLinkedList list = new myLinkedList();
        list.add(56);
        list.add(30);
        list.add(70);

        list.show();
        System.out.println(" ");

        node temp = list.Head;
        if(temp != null ) {
            list.Head = temp.next;
        }

        list.show();
    }
}
