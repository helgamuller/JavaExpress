package Collections.collections.ArrayList._PriorityQueueTasks.ArrayDequeu;

import java.util.ArrayDeque;
////Реализуйте метод, который проверяет симметричность строки (палиндром) с использованием ArrayDeque.
public class Palindrome {
    private static String str;
    private static ArrayDeque<Character> palindrome;

    static {
        palindrome = new ArrayDeque<Character>();
        str = null;
    }
    private static boolean isPalindrome(String str) {
        boolean isPalindrome = false;
        for (Character c : str.toCharArray()) {
            palindrome.addLast(c);
        }
        for (int i = 0; i < palindrome.size()/2; i++) {
            if(palindrome.pollFirst().equals(palindrome.pollLast())) {
            isPalindrome =true;
            continue;
            }
            else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;

    }


        public static void main (String[]args){
            str = "12321";
            System.out.println(" Is string a palindrom? " + isPalindrome(str));
        }


    }
