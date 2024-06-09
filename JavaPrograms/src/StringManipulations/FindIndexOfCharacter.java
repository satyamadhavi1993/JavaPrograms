package StringManipulations;

public class FindIndexOfCharacter {
    public static void main(String[] args) {
        String str = "The rains have started here";
        int first_index = str.indexOf('e');
        System.out.println("First occurence of character 'e' "+first_index);
        int second_index = str.indexOf('e', first_index + 1);
        System.out.println("Second occurence of character 'e' "+second_index);
        int third_index = str.indexOf('e', second_index + 1);
        System.out.println("Third occurence of character 'e' "+third_index);
    }
}
