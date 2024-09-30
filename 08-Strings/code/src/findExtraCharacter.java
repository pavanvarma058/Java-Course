import java.util.Arrays;

public class findExtraCharacter {
    public static void main(String[] args) {
        // Find one extra character
        String s1 = "aabcbc";
        String s2 = "abbccba";
        char extra = findExtraChar(s1, s2);
        System.out.println(extra);
    }
    // Method 1
    public static char findExtra(String s1, String s2){
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if(a1[i]!=a2[i]){
                return a2[i];
            }
        }
        return a2[n];
    }

    // Method 2
    public static char findExtraChar(String s1, String s2){
        int count[] = new int[26];
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            count[s1.charAt(i) - 'a']--;
            count[s2.charAt(i) - 'a']++;
        }
        count[s2.charAt(n) - 'a']++;
        for (int i = 0; i < 26; i++) {
            if(count[i]==1){
                return (char) (i+'a');
            }
        }
        return 0;
    }
}
