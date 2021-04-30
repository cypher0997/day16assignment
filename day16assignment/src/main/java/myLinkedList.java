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

    public void insertAt(int index, int Data) {
        node newNode = new node();
        newNode.data = Data;
        newNode.next = null;

        node temp = Head;
        for(int i=0;i<index-1;i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int search(int element)
    {

        if (Head == null) {
            return -1;
        }

        int index = 0;
        node temp = Head;

        while (temp != null) {

            if (temp.data == element) {
                return index;
            }

            index++;
            temp = temp.next;
        }

        return -1;
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
