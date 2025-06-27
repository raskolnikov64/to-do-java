public class to_do {
    Node head;

    static class Node{
        String task;
        String date;
        Node next;

        Node(String x, String y){
            task = x;
            date = y;
            next = null;
        }
    }

}
