package alg4;

/**
 * binary serarch is a tricky algorithm that can easily have infinite loops.
 * how to set middle, middle = begin + (end - begin)/2
 * how to move begin and end: begin = middle + 1; end = middle - 1;
 * how initialize begin and end? begin =0; end = array.length -1;
 */

public class BinarySearch {

    /**
     * use binary search to search a key
     * @param key value to find
     * @param array an array of sorted values in ascending order
     * @return -1 if not found; otherwise an index of the first found element
     */
    public static int binarySearch(final int key, final int[] array) {
        int begin = 0, end = array.length - 1;
        while(begin <= end) {
           int middle = begin + (end - begin) /2;
           System.out.println("middle = "+ middle);
           if(key == array[middle])
               return middle;
           if(key > array[middle]){
               begin = middle + 1;
           }else{
               end = middle - 1;
           }
        }
        return -1;
    }

  public static <T extends Comparable<T>> int binarySearchG(final T key, final T[] array) {
      int begin = 0, end = array.length - 1;
      while(begin <= end) {
         int middle = begin + (end - begin) /2;
         System.out.println("middle = "+ middle);
         if(array[middle].equals(key))
             return middle;
         if(array[middle].compareTo(key) < 0){
             begin = middle + 1;
         }else{
             end = middle - 1;
         }
      }
      return -1;
  }
}

