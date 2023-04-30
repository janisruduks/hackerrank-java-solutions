public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int numbSubstring = s.length() - k + 1;
        String[] smallestToLargest = new String[numbSubstring];

        for(int i = 0; i < numbSubstring; i++){
            smallestToLargest[i] = s.substring(i, i + k);

            if (smallestToLargest[i].compareTo(smallest) < 0) {
                smallest = smallestToLargest[i];
            }
            if (smallestToLargest[i].compareTo(largest) > 0) {
                largest = smallestToLargest[i];
            }
        }
        return smallest + "\n" + largest;
    }
}
