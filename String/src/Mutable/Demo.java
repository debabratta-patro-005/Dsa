package Mutable;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder copy = new StringBuilder();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            copy.append(c);
        }
        System.out.println("Original String: " + str);
        System.out.println("Copy String: " + copy);










//
//        StringBuilder sb = new StringBuilder("Kodnest");
//        System.out.println(sb);
//        sb.setCharAt(5,'h');
//        System.out.println("setCharAt: " + sb + " Capacity: " + sb.capacity());
//
//
//        sb.trimToSize();
//        System.out.println("trim to size: "+sb + " Capacity: " + sb.capacity());

    }
}
