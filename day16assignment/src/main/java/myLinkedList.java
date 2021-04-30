public class myLinkedList {
    node Head;

    public void add(int Data) {

        node n = new node();
        n.data = Data;
        n.next = null;

        if(Head == null) {
            Head = n;
        }
        else {
            node temp = Head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

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
