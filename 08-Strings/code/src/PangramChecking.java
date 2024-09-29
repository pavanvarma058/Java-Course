public class PangramChecking {
    public static void main(String[] args) {
        // Panagram Checking
        String str = "The quick brown fox jumps over a lazy dog";
        if(isPanagram(str) == true){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean isPanagram(String s){
        int n = s.length();
        if(n<26){
            return false;
        }
        boolean visited[] = new boolean[26];
        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            if(x >= 'a' && x <= 'z'){
                visited[x-'a'] = true;
            }
            if(x >= 'A' && x <= 'Z'){
                visited[x-'A'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if(visited[i] == false){
                return false;
            }
        }
        return true;
    }
}
