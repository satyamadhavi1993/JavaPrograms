package StringManipulations;

public class RemoveJunkCharactersFromString {
    public static void main(String[] args) {
        String name = "89m%a))d>--h@@a$vi";
        String name2 = name.replaceAll("[^a-zA-Z0-9@]", "");
        System.out.println(name2);
    }
}
