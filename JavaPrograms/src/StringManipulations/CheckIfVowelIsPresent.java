package StringManipulations;

public class CheckIfVowelIsPresent {
    public static void main(String[] args) {
        String str = "Satya";
        String str2 = "bcdfghklmn";
        System.out.println("Contains vowels :: "+usingStringIndexOf(str));
        System.out.println("Contains vowels :: "+usingStringIndexOf(str2));
        System.out.println("Contains vowels :: "+usingIf(str));
        System.out.println("Contains vowels :: "+usingIf(str2));
    }

    public static boolean usingStringIndexOf(String str) {
        String vowels = "aeiou";
        for (int i=0; i< str.length(); i++) {
            if(vowels.indexOf(str.toLowerCase().charAt(i)) != -1){
                return true;
            }
        }
        return false;
    }

    public static boolean usingIf(String str) {
        for (int i=0; i< str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                return true;
            }
        }
        return false;
    }
}
