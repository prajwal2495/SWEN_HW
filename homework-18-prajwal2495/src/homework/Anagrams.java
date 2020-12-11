package homework;

import java.io.*;
import java.util.*;

/**
 * @author Prajwal Krishna
 * Beginning of class AnagramException
 */
public class Anagrams {
    /**
     * method readWords()
     * @param filename, name of the file.
     * @return set of strings with only unique words
     * @throws AnagramException, throws a custom anagram exception for a file that does not exist
     * @throws IOException, handling IOException for File class
     */
    public static Set<String> readWords(String filename) throws AnagramException, IOException {
        File file = new File(filename);

        if(!file.exists()){
            throw new AnagramException("Anagram test file does not exist");
        }

        FileReader fileReader = new FileReader(filename);
        BufferedReader br = new BufferedReader(fileReader);
        String line;

        Set<String> AllUniqueWords = new HashSet<>();


        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            AllUniqueWords.addAll(Arrays.asList(words));
        }

        fileReader.close();
        return AllUniqueWords;
    }

    /**
     * method sortWord()
     * used to sort the given word.
     * @param word, a String that need to be sorted
     * @return String word that is sorted
     */
    public static String sortWord(String word){
        String sortedWord;
        word = word.toLowerCase();
        char[] charArray = new char[word.length()];
        int[] charToIntegerArray = new int[charArray.length];

        for(int i = 0; i < word.length(); i++){
            charArray[i] = word.charAt(i);
        }

        for(int i = 0; i < charArray.length; i++){
            charToIntegerArray[i] = charArray[i];
        }

        Arrays.sort(charToIntegerArray);
        char[] sortedArrayOfCharacters = new char[charArray.length];

        for(int i = 0; i < charToIntegerArray.length; i++){
            sortedArrayOfCharacters[i] = (char) charToIntegerArray[i];
        }

        sortedWord = new String(sortedArrayOfCharacters);

        return sortedWord;
    }

    /**
     * method getPermutation()
     * used to get a list where list contains all the combinations of the string.
     * @param word
     * @return, list of combinations of given string
     */
    public static List<String> getPermutation(String word) {

        if (word.length() == 0) {
            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }
        char character = word.charAt(0);
        String subStr = word.substring(1);

        System.out.println(character + "   "+ subStr);


        List<String> permutationsOfString = getPermutation(subStr);

        List<String> allPermutationsList = new ArrayList<>();

        for (String eachString : permutationsOfString) {
            for (int i = 0; i <= eachString.length(); i++) {
                allPermutationsList.add(eachString.substring(0, i) + character + eachString.substring(i));
            }
        }
        Collections.sort(allPermutationsList);
        return allPermutationsList;
    }

    /**
     * method makeAnagrams()
     * used to make a map of anagrams, key : sorted word, Value : permutations of all sorted words
     * @param uniqueWords, the output of the readWords method
     * @return An anagram map
     */
    public static Map<String,List<String>> makeAnagrams(Set<String> uniqueWords){

        Map<String,List<String>> anagramMap = new HashMap<>();
        List<String> combinationOfCharactersInWord;


        for(String word : uniqueWords){
            String sortedWord = sortWord(word);
            combinationOfCharactersInWord = getPermutation(sortedWord);
            anagramMap.put(sortedWord,combinationOfCharactersInWord);
        }
        return anagramMap;
    }

    public static Map<String,List<String>> makeAnagrams(String word){

        Map<String,List<String>> anagramMap = new HashMap<>();
        List<String> combinationOfCharactersInWord;

        String sortedWord = sortWord(word);
        combinationOfCharactersInWord = getPermutation(sortedWord);
        anagramMap.put(sortedWord,combinationOfCharactersInWord);

        return anagramMap;
    }

    /**
     * method writeAnagrams()
     * used to write the anagramMap to a file.
     * @param anagramMap a map of <sortedWord,listOfAllAnagrams>
     * @param filename a file to write into
     * @throws AnagramException, throws a custom anagram exception for a file that does not exist
     * @throws IOException, handling IOException for File class
     */
    public static void writeAnagrams(Map<String,List<String>> anagramMap, String filename) throws AnagramException,IOException {
        FileWriter fileWriter = new FileWriter(filename);

        for (String key : anagramMap.keySet()) {
            fileWriter.write("KEY:" + key);
            fileWriter.write("\t");
            fileWriter.write("Value:[ ");
            for (String anagram : anagramMap.get(key)) {
                fileWriter.write(anagram);
                fileWriter.write("  ");
            }
            fileWriter.write("]");
            fileWriter.write("\n");
        }
        fileWriter.close();

    }

    /**
     * method main()
     * used to test all the outputs and also to write the anagram map to the file
     * @param args default args
     * @throws AnagramException, throws a custom anagram exception for a file that does not exist
     * @throws IOException, handling IOException for File class
     */
    public static void main(String[] args) throws IOException, AnagramException {
        // using testing_file.txt because the file words_alpha.txt is too large and program is ending abruptly because of java's heap memory overflow
        Set<String> uniqueWords = readWords("testing_file.txt");

        Map<String,List<String>> anagramMap = makeAnagrams(uniqueWords);

        writeAnagrams(anagramMap,"Key_SortedAnagrams.txt");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter input file name:(testing_file.txt)");
        String inputFileName = scan.nextLine();
        System.out.println("enter output file name:");
        String outputFileName = scan.nextLine();


        Set<String> uniqueWordsUser = readWords(inputFileName);
        Map<String,List<String>> anagramMapUser = makeAnagrams(uniqueWordsUser);
        writeAnagrams(anagramMapUser,outputFileName);

        String anagramWord;

        for(;;){
            System.out.println("enter a word to get Anagrams:");
            anagramWord = scan.nextLine();
            if(anagramWord.equals(null) || anagramWord.equals("") || anagramWord.equals("null") || anagramWord.equals("\n") || anagramWord.equals(" ")){
                System.exit(1);
            }
            Map<String, List<String>> userAnagramMap;
            userAnagramMap = makeAnagrams(anagramWord);
            for(String anagrams : userAnagramMap.keySet()){
                System.out.println(anagrams+":{"+userAnagramMap.get(anagrams)+"}");
            }
        }
    }
}

