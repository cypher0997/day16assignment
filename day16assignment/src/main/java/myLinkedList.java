public class myLinkedList {
    node Head;

    public void addInRecursive(int Data) {
        node newNode = new node();
        newNode.data = Data;
        newNode.next = Head;

        Head = newNode;

    }

    public void show(){
        node show = Head;
        while(show.next != null) {
            System.out.println(show.data);
            show = show.next;
        }
        System.out.println(show.data);
    }
}
