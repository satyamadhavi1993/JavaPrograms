package StringManipulations;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "coding4life";
        // String str2 = "g4lifeodin";
        String str2 = "4lifecoding";
        // Check if str2 is rotation of str1
        String str3 = str1 + str2;
        System.out.println("Is rotation ? "+str3.contains(str2));
    }
}
