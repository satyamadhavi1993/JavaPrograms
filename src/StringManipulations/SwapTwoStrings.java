package StringManipulations;

public class SwapTwoStrings {
    public static void main(String[] args) {
        
    String str1 = "Satya";
    String str2 = "Madhavi";
    System.out.println("Before String 1 is "+str1+" String 2 is "+str2);
    str1 = str1 + str2; 
    str2 = str1.substring(0, str1.length()-str2.length());
    str1 = str1.substring(str2.length());
    System.out.println("After String 1 is "+str1+" String 2 is "+str2);

    }
}
