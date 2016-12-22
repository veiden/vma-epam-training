public class LinkedIntMatrix {

    public LinkedIntMatrix(int size){
        int secondIndex;
        for (int i = 0; i < size; ++i){
            this.add(new LinkedIntList());
            secondIndex = size - 1 - i;
            for(int j = 0; j < size; ++j){
                if (j == i || j == secondIndex){
                    this._tail.add(1);
                } else{
                    this._tail.add(0);
                }    
            }
        }
    }

    public void writeMatrix(){
        if (null == _head){
            return;
        }
        LinkedIntList list = _head;
        while (null != list.next){
            list.writeList();
            list = list.next;
        }
        list.writeList();
    }




    private LinkedIntList _head;
    private LinkedIntList _tail;

    public void add(LinkedIntList value){
        if (null == _head){
            _head = value;
            _tail = value;
        } else {
            _tail.next = value;
            value.previous = _tail;
            _tail = value;
        }
    }

    public int length(){
        if (null == _head){
            return 0;
        }
        LinkedIntList node = _head;
        int length = 1;
        while (null != node.next){
            node = node.next;
            ++length;
        }

        return length;
    }

}