package homework;

import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * beginning of the test class AnagramsTest
 */
class AnagramsTest {

    /**
     * method testReadWords
     * used to test whether an AnagramException is thrown or not
     * @throws AnagramException, throws a custom anagram exception for a file that does not exist
     * @throws IOException, handling IOException for File class
     */
    @Test
    public void testReadWords() throws IOException,AnagramException {
        //setup
        String FileName = "doesNotExist.txt";

        //invoke and assert
        try {
            Set<String> fileContents = Anagrams.readWords(FileName);
            fail("An exception should occur");
        }catch (AnagramException e){
            //System.out.println("in catch:"+e.getMessage());
            assertEquals("Anagram test file does not exist",e.getMessage());

        }
    }

    /**
     * method testSortWords()
     * used to test whether a given word is sorted or not
     */
    @Test
    public void testSortWords(){
        //setup
        String word = "tea";

        //invoke
        String exceptedSortedWord = "aet";
        String sortedWord = Anagrams.sortWord(word);

        //assert
        assertEquals(exceptedSortedWord,sortedWord);

    }

    /**
     * method testGetPermutations()
     * used to check whether the list of permutations are correct or not
     */
    @Test
    public void testGetPermutations(){
        //setup
        String word = "tea";
        List<String> expectedList = Arrays.asList("aet", "ate", "eat", "eta", "tae", "tea");

        //invoke
        List<String> actualList = Anagrams.getPermutation(word);

        //assert
        assertEquals(expectedList,actualList);
    }

}