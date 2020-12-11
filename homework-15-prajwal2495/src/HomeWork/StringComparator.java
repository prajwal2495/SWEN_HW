package HomeWork;

import java.util.Comparator;

/**
 * beginning of class StringComparator
 */
public class StringComparator implements Comparator {

    /**
     * method compare()
     * used to compare two strings to find which one is greater than the other
     * @param o1, first String
     * @param o2, second String
     * @return int value depicting the result of the comparison
     */
    @Override
    public int compare(Object o1, Object o2) {
        String firstObject = ((String) o1).toUpperCase();
        String secondObject = ((String) o2).toUpperCase();

        if(firstObject.compareTo(secondObject) < 0){
            return -1;
        }else if(firstObject.compareTo(secondObject) > 0){
            return 1;
        }else{
            return 0;
        }
    }
}
