package com.company;

import java.util.*;


public class generic {
    public static void main(String[] args) {
//        String s = "abc def ghi jkl mno";
//        String[] parts = s.split(" ");
//        for (String part : parts) {
//            System.out.println(part);
//        }
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = new String("hello");
//        if(s1==s2){
//            System.out.println("Saahi Baat hai");
//        }
//        if(s1==s3){
//            System.out.println("Ye Bhi Saahi Baat hai");
//        }
//        else{
//            System.out.println("Ye Galat Baat hai");  //Due to Interning Pool
//        }
//        if(s1.equals(s3)){
//            System.out.println("katayi Zeher");
//        }
        //Gist --> Never Use "==" in case of strings use s.equals(s1)


        StringBuilder sb = new StringBuilder("Hello");
        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(0,'d'); //update
        System.out.println(sb);

        sb.insert(2,'y'); //insert
        System.out.println(sb);

        sb.deleteCharAt(2); //remove
        System.out.println(sb);

        sb.append('g');//append at last
        System.out.println(sb);
            }

    }

