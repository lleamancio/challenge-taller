package com.example.challengetaller;

import java.util.ArrayList;

public class Main {
        /*
    Strings Rotations of Each Other

    "You are given two strings s1 and s2, of equal lengths. The task is to check if s2 is a rotated version of the string s1.

    Note: A string is a rotation of another if it can be formed by moving characters from the start to the end (or vice versa) without rearranging them.
    "


    Examples :

    Input: s1 = "abcd", s2 = "cdab"
    Output: true
    Explanation: After 2 right rotations, s1 will become equal to s2.

    Input: s1 = "aab", s2 = "aba"
    Output: true
    Explanation: After 1 left rotation, s1 will become equal to s2.

    Input: s1 = "abcd", s2 = "acbd"
    Output: false
    Explanation: Strings are not rotations of each other.
    */

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "acbd";

        //get last infomartion at last position
        //compare with s1

        StringBuilder rotated = new StringBuilder();
        for(char x : s2.toCharArray()){
            rotated.append(x);
        }

        for(int j = 0; j < s2.length() - 1; j++){
            var
        }
        var roteatedString = rotated.substring(s2.length() - 1);
        System.out.println(rotated.);

        System.out.println(rotated);
    }



}
