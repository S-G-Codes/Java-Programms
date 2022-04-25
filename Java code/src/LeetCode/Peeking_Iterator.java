import java.util.Iterator;

class Peeking_Iterator{



    class PeekingIterator implements Iterator<Integer> {
       
        Integer nextElement = null;
        Iterator<Integer> it = null;

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.it = iterator;
            nextElement = it.next();
            
        }
        
        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return nextElement;
        }
        
        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer valuetoReturn = nextElement;
            if(it.hasNext()){
                this.nextElement = it.next();
            }else{
                this.nextElement = null;
            }
            return valuetoReturn;
        }
        
        @Override
        public boolean hasNext() {
            return nextElement != null;
        }
    }
}