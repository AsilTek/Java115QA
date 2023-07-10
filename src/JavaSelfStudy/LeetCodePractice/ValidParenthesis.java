package JavaSelfStudy.LeetCodePractice;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        String str = "({[[}]]}";
        System.out.println(checkParentheses(str));

    }
    public static boolean checkParentheses(String s) {

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;


        for (char each : s.toCharArray()) {
            if (each == '(') {
                count1++;
            } else if (each == ')') {
                count1++;
            } else if (each == '[') {
                count2++;
            } else if (each == ']') {
                count2++;
            } else if (each == '{') {
                count3++;
            } else if (each == '}') {
                count3++;
            }

            if (count1 % 2 == 0  && count2 % 2 == 0 && count3 % 2 == 0)  {
                return true;
            }
        }

        return false;
    }
    //Second way
    public static boolean checkParentheses2(String s){
        Stack<Character> stack = new Stack<Character>();

        for (Character each : s.toCharArray()) {
            if (each.equals('(') || each.equals('{') ||each.equals('['))
                stack.push(each);
            else if(each.equals(')') && stack.peek().equals('('))
                stack.pop();
            else if (each.equals('}') && stack.peek().equals('{'))
                stack.pop();
            else if (each.equals(']') && stack.peek().equals('['))
                stack.pop();
        }
        return  stack.empty();
    }
}
