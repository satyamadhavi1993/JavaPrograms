package StringManipulations;

public class RemoveAlphabetsFromAString {
    public static void main(String[] args) {
        String name = "89m%a))dad>--h@@a$vi";
        name = name.replaceAll("[a-zA-Z]", "");
        System.out.println(name);
    }
}
