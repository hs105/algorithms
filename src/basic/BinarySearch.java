package basic;

public class BinarySearch {

    /**
     * use binary search to search a key
     * @param key value to find
     * @param array an array of sorted values in ascending order
     * @return -1 if not found; otherwise an index of the first found element
     */
    public static <T extends Comparable<T>> int binarySearch(final T key, final T[] array) {
        int begin = 0, end = array.length;
        int middle = -1;
        while(begin <= end) {
           middle = (begin + end) /2;
           if(array[middle].equals(key))
               return middle;
           if(array[middle].compareTo(key) < 0){
               begin = middle;
           }else{
               end = middle;
           }
        }
        return middle;
    }
}
