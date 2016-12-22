public class LinkedIntList {


    private class LinkedIntNode{



        LinkedIntNode(int value){
            this.value = value;
            this.next = null;
            this.previous = null;
        }
        public int value;
        public LinkedIntNode next;
        public LinkedIntNode previous;

    }

    private LinkedIntNode _head;
    private LinkedIntNode _tail;
    public LinkedIntList next;
    public LinkedIntList previous;

    public void add(int value){
        LinkedIntNode newNode = new LinkedIntNode(value);
        if (null == _head){
            _head = newNode;
            _tail = newNode;
        } else {
            _tail.next = newNode;
            newNode.previous = _tail;
            _tail = newNode;
        }
    }

    public void writeList(){
        if (null == _head){
            return;
        }
        LinkedIntNode node = _head;
        while (null != node.next){
            System.out.print(node.value + "");
            node = node.next;
        }
        System.out.println(node.value);
    }

    public int length(){
        if (null == _head){
            return 0;
        }
        LinkedIntNode node = _head;
        int length = 1;
        while (null != node.next){
            node = node.next;
            ++length;
        }

        return length;
    }

}
