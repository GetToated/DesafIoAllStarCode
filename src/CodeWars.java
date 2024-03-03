public class CodeWars {
    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello";
        char letter = 'o';
        System.out.println(strCount(str, letter));
    }
}
