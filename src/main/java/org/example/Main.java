package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));

        System.out.println(isPalindrome(-21));
        System.out.println(isPerfectNumber(26));

        System.out.println(numberToWords(9990));

    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed = "";
        for (int i = digits.length - 1; i >=0; i--) {
            reversed += digits[i];
        }

        return  reversed.equalsIgnoreCase(String.valueOf(number));
    }



    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }
        int total = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        return number == total;
    }

    public static  String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value";
            char[] digits = String.valueOf(number).toCharArray();
            String numToTex = "";
            for (char digit : digits) {
                switch (digit) {
                    case '0':
                        numToTex += "Zero ";
                        break;
                    case '1':
                        numToTex += "One ";
                        break;
                    case '2':
                        numToTex += "Two ";
                        break;
                    case '3':
                        numToTex += "Three ";
                        break;
                    case '4':
                        numToTex += "Four ";
                        break;
                    case '5':
                        numToTex += "Five ";
                        break;
                    case '6':
                        numToTex += "Six ";
                        break;
                    case '7':
                        numToTex += "Seven ";
                        break;
                    case '8':
                        numToTex += "Eight ";
                        break;
                    case '9':
                        numToTex += "Nine ";
                        break;
                }
            }
            return numToTex.trim();
        }









}
