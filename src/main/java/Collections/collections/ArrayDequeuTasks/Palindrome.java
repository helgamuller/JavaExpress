package Collections.collections.ArrayDequeuTasks;

import java.util.ArrayDeque;

////Реализуйте метод, который проверяет симметричность строки (палиндром) с использованием ArrayDeque.
public class Palindrome {
    private static String str;
    private  static ArrayDeque<Character> chars;
    static {
        str = null;
        chars = new ArrayDeque<>();
    }
    //
    private static boolean isPalindrome(String str){
        boolean isPalindrome =false;
        for(Character c: str.toCharArray())
            chars.offer(c);
        for (int i = 0; i < chars.size()/2; i++) {
            if(chars.pollFirst().equals(chars.pollLast())) {
                isPalindrome = true;
                continue;
            }
            else {
                isPalindrome = false;
                break;
            }

        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        str = "123211";
       // isPalindrome(str);
        System.out.println(isPalindrome(str));
    }
}
