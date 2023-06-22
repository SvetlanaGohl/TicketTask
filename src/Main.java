import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        System.out.println("ЗАДАЧА 1");
        String word = "Около Мити молоко";
        boolean isPalindrom = false;
        String wordTrue = word.replace(" ", "");
        String string = wordTrue.toLowerCase();
        char[] s = string.toCharArray();
        for (int i = 0; i < s.length / 2 + 1; i++) {
            if (s[i] == s[s.length - 1 - i]) {
                isPalindrom = true;
            } else {
                isPalindrom = false;
                break;
            }
        }
        System.out.println(isPalindrom);
    }

    public static void task2() {
        System.out.println("ЗАДАЧА 2");
        String word1 = "Около Мити молоко";
        String string = word1.toLowerCase().replace(" ", "");
        char[] s = string.toCharArray();
        System.out.println(s); // строка для проверки вывода слова
        char[] reverseString = Arrays.copyOf(s, s.length); {
            for (int i = reverseString.length - 1; i >= 0; i--) {
                System.out.print(reverseString[i]);  // строка для проверки вывода слова
            }
            System.out.println();
        }
        System.out.println(reverseString.equals(s));

//        boolean charAreEqual = true;
//        charAreEqual = s.length == reverseString.length;
//        if (charAreEqual) {
//            for (int count = 0; count < reverseString.length; count++) {
//                if (s[count] != reverseString[count]) {
//                    charAreEqual = false;
//                }
//            }
//        } if (charAreEqual) {
//            System.out.println("Палиндром");
//        } else {
//            System.out.println("Не палиндром");
//        }
    }  // возможно требуется разбить массив на ячейки, чтобы сравнивать каджую, а в строках используются другие методы сравнения
}



