public class SLList {
    public class IntNode {//IntNode变成了内部类
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first; 

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        IntNode c;
        last =first;
        while(last.item!=null){
        last = last.item;
        }
        last = new IntNode(x, null);
    }

    /** Returns the number of items in the list using recursion. */
    //递归用的是if 初始条件 然后关联关系
    public int size() {
        /* Your Code Here! */
        if (first == null ){
        return 1;
        }return 1+first.next.size;
    }

}
