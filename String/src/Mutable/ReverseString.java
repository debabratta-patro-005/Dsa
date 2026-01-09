package Mutable;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Kodnest";
        StringBuilder sb = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            sb.append(str.charAt(i));
//        }
        char[] arr =  str.toCharArray();
        for(int i = arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        System.out.println("Originl String: " + str);
        System.out.println("Reversed String: " + sb);
    }
}
