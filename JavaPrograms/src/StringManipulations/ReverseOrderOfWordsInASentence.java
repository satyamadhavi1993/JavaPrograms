package StringManipulations;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseOrderOfWordsInASentence {
    public static void main(String[] args) {
        String str = "Hello World, this is CS50";
        usingForLoop(str);
        // usingIterator(str);
        // usingArrays(str);
    }

    public static void usingForLoop(String str) {
        String[] strArr = str.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--)
        {
            System.out.print(strArr[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void usingIterator(String str) {
        List<String> list1 = new LinkedList<>(Arrays.asList(str.split(" ")));
        ListIterator<String> it = list1.listIterator(list1.size());
        while(it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println();
    }

    public static void usingArrays(String str) {
        String[] arr2 = str.split(" ");
		int left = 0;
		int right = arr2.length - 1;
		String temp = "";
		while (left < right) {
			temp = arr2[left];
			arr2[left] = arr2[right];
			arr2[right] = temp;
			left ++;
			right --;
		}
		str = String.join(" ", arr2);
		System.out.println(str);
    }
}
