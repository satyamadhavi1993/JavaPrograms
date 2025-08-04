package StringManipulations;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        String str = "codingforlife";
        String vowels = "aeiou";
        String str2 = "";
        for (char c:str.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                str2 += c;
            }
        }
        System.out.println("After removing vowels :: "+str2);
    }
}
