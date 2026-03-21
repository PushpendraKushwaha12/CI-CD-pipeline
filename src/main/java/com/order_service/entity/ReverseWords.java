package com.order_service.entity;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "vinita";

        String result = "";
        result += str.charAt(str.length()-2);
        for(int i = 0; i < str.length(); i++){
            if (i == str.length() - 2) {
                continue;
            }
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
