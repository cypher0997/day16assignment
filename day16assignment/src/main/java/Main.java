public class Main {
    public static void main(String args[]) {

        myLinkedList list = new myLinkedList();
        list.add(56);
        list.add(30);
        list.add(70);

        list.show();
        System.out.println(" ");

         node temp = list.Head;
         while(temp.next.next != null) {
             temp = temp.next;
         }
         temp.next = null;

        list.show();
    }
}
