package com.jap;

public class ReverseStringDemo {
    public static void main(String[] args) {
        String word="Programming";
        ReverseStringDemo reverseStringDemo=new ReverseStringDemo();
        reverseStringDemo.getReverseString(word);
        //Create a String object.

        //Create an object of the class ReverseStringDemo

        //Call the method getReverseString() and pass the parameter
    }
    //Write the logic to reverse the String  inside the below method and return the reverse String.
    public  String getReverseString(String revString) {
        String str1 = new String();
        char[] str = revString.toCharArray();
        System.out.print("Reverse String IS ");
        for (int i = str.length - 1; i >= 0; i--) {
            str1=str1+String.valueOf(str[i]);
            System.out.print(str[i]);
        }
        return str1;
    }
}