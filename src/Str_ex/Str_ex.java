package Str_ex;

import java.io.*;
import java.util.*;
 
class Str_ex {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Declaring a char variable
        char c = 'S';
        char b = 'u';
        char a = 'n';
        char d = 'i';
        char e = 'l';
 
        // Concatenating the char variable
        // with an empty string
        String s = "" + c + b + a + d + e;
       
        // Print and display the above string
        System.out.println(
            "Char to String using Concatenation :"
            + " " + s);
    }
}