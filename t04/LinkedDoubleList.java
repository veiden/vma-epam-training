public class LinkedDoubleList {

    public LinkedDoubleList(String array){
        String value;
        int lastSpace = 0;
        int arrayLength = array.length();
        for (int i = 0; i < arrayLength; ++i){

            if (' ' == array.charAt(i)||i == arrayLength - 1){
                    value = array.substring(lastSpace, i);
                    this.add(Double.parseDouble(value));
                    lastSpace = i;
            }
        }
    }

    public void findMaxPair(){
        double maxValue = Double.NEGATIVE_INFINITY;
        int length = this.length()/2;
        LinkedDoubleNode leftNode = this._head;
        LinkedDoubleNode rightNode = this._tail;
        for (int i = 0; i < length; ++i){
            if (leftNode.value + rightNode.value > maxValue){
                maxValue = leftNode.value + rightNode.value;
                leftNode = leftNode.next;
                rightNode = rightNode.previous;
            }
        }
        System.out.println("Maximum value is " + maxValue);


    }

    private class LinkedDoubleNode{



        LinkedDoubleNode(double value){
            this.value = value;
            this.next = null;
            this.previous = null;
        }
        public double value;
        public LinkedDoubleNode next;
        public LinkedDoubleNode previous;

    }

    private LinkedDoubleNode _head;
    private LinkedDoubleNode _tail;

    public void add(double value){
        LinkedDoubleNode newNode = new LinkedDoubleNode(value);
        if (null == _head){
            _head = newNode;
            _tail = newNode;
        } else {
            _tail.next = newNode;
            newNode.previous = _tail;
            _tail = newNode;
        }
    }

    public int length(){
        if (null == _head){
            return 0;
        }
        LinkedDoubleNode node = _head;
        int length = 1;
        while (null != node.next){
            node = node.next;
            ++length;
        }

        return length;
    }

}