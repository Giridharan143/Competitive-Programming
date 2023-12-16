import java.util.*;
import java.lang.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            String words = inp.next().toUpperCase(); // Corrected the method name toUpperCase()
            String vowels = "AEIOU";
            boolean out = true; // Corrected the data type to 'boolean' instead of 'Boolean'
            for (int i = 0; i < words.length(); i++) {
                if (i % 2 != 0 && i != 7) {
                    if (vowels.indexOf(words.charAt(i)) == -1) { // Corrected the metname charAt()
                        out = false;
                        break;
                    }
                } else if (vowels.indexOf(words.charAt(i)) != -1) { // Corrected the method name charAt()
                    out = false;
                    break;
                }
            }
            System.out.println(out ? "YES" : "NO");
        }
    }
}
