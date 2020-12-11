package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class HashingMapTest, child class of AbstractMapTest
 */
class HashingMapTest extends AbstractMapTest{

    /**
     * method makeMap()
     * helps in creating a Map object referencing to the HashingMap class
     * @return an object of Map class with key being an Integer class and value being a String
     */
    @Override
    public Map makeMap() {
        Map<Integer,String> testMap = new HashingMap<>();
        return testMap;
    }
}