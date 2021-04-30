import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void checkLinkedList() {
        myLinkedList list = new myLinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        int res = list.search(30);
        Assertions.assertEquals(1, res);
    }
}
