package com.company;

public class ReverseStrings {
    
    //Time Complexity: O(n)
    public static String reverseWordWithStack(String word){
        if(word.length() == 0){
            return word;
        }
        Stack<Character> stack = new Stack();
        StringBuilder reverseWord = new StringBuilder();
        for(int i = 0; i < word.length(); ++i){
            stack.push(word.charAt(i));
        }
        while(!word.isEmpty()){
            reverseWord.append(stack.pop());
        }
        return reverseWord.toString();
    }
    
    //Time Complexity: O(n)
    public static String reverseWordIteratively(String word){
        StringBuilder reverseWord = new StringBuilder();
        for(int i = 0; i < word.length(); ++i){
            reverseWord.append(word.charAt(word.length()-i-1));
        }
        return reverseWord.toString();
    }

    //Time Complexity: O(n)
    public static String reverseWordRecursively(String word){
        if(word.length() == 1){
            return word;
        }
        return reverseWordRecursively(word.substring(1)) + word.charAt(0);
    }

    //Time Complexity: O(n)
    public static String reverseSentenceIteratively(String sent){
        String[] strArr = sent.split(" ");
        StringBuilder reverseSentence = new StringBuilder();
        for(int i = 0; i < strArr.length/2; ++i){
            String temp = strArr[i];
            strArr[i] = strArr[strArr.length-i-1];
            strArr[strArr.length-i-1] = temp;
        }
        for(int i = 0; i < strArr.length; ++i){
            if(strArr[i] == strArr[strArr.length-1]){
                reverseSentence.append(strArr[i]);
            }else{
                reverseSentence.append(strArr[i] + " ");
            }
        }
        return reverseSentence.toString();
    }
    //Time Complexity: O(n)
    public static String reverseSentenceRecursively(String sent){
        if(sent.lastIndexOf(" ") == -1){
            return sent;
        }
        return sent.substring(sent.lastIndexOf(" ")+1) + " " +reverseSentenceRecursively(sent.substring(0,sent.lastIndexOf(" ")));
    }

    public static void main(String[] args) {
        String sent = "I am coding";
        String word = "etc";

        System.out.println(reverseWordIteratively(word));
        System.out.println(reverseWordRecursively(word));

        System.out.println(reverseSentenceIteratively(sent));
        System.out.println(reverseSentenceRecursively(sent));
    }

}
