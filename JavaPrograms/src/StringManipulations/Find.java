package StringManipulations;

public class Find {
    public static void main(String[] args) {
        String name = "89m%a))dad>--h@@a$vi";
        int l = name.length();
        name = name.replaceAll("[a-zA-Z]", "");
        System.out.println(name);
        System.out.println("Alpha ");
    }
}
