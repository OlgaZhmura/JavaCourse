package com.playtika.javacourse;

public class Strings {

    public static void main(String[] args) {
        String s1 = " Hello  ";
        String s2 = "Hello"; // here's link to content from s1
        String s3 = new String("Hello"); // create new obj

//compare links
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
// compare content (compare obj)
        System.out.println(s1.equals(s3));

        System.out.println(s1.length());
        System.out.println(s1.trim()); // delete all spaces, here creates new string and doesn't change s1
        System.out.println(s1);
        System.out.println(s1.substring(1, 3)); //print all elements from x til y-1
        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.replaceAll("l", "p"));
        System.out.println(s1.contains("ell")); //have this str this substr

        StringBuilder sb = new StringBuilder(); //this class doesn't create new string during operations
        String str = sb.append(1)  //add to end of str
          .append('c')
          .append("hi")
          .toString();
        System.out.println(str);
        String s = 1 + "c" + "hi"; //here creates 3additional str so sb is better to use in loop
        System.out.println(s);
    }
}