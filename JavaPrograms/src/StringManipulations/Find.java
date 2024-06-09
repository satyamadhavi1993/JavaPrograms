package StringManipulations;

public class Find {
    // // String name = "89m%a))dad>--h@@a$vi";
    // char[] ch = name.toCharArray();
    // int a = 0;
    // for (char c:ch) {
    //     if(Character.isAlphabetic(c)) {
    //         a++;
    //     } else if(Character.isDigit(c)) {

    //     }
    // }
    public static void main(String[] args) {
        String name = "89m%a))dad>--h@@a$vi";
        int l = name.length();
        name = name.replaceAll("[a-zA-Z]", "");
        System.out.println(name);
        System.out.println("Alpha ");
    }
}
