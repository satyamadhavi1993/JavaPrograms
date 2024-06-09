package StringManipulations;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        String str = " My Nam e is  Ja ke Peral ta ";
        String[] strArr = str.split(" ");
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i< strArr.length;i++) {
            strArr2[i] = strArr[i].trim();
        }
        System.out.println(String.join("", strArr2));
        System.out.println("--------------------------------");
        String str2 = " My Nam e is  Ja ke Peral ta ";
        System.out.println(str2.replaceAll(" ", ""));
    }

}
