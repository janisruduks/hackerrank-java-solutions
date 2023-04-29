public class Anagrams {
    public static boolean anagrams(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        String[] A = a.split("");
        String[] B = b.split("");

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (B[i].equals(A[j])) {
                    A[j] = "";
                    break;
                }
            }
        }
        return String.join("", A).equals("");
    }
}