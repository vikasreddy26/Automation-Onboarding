package coreJava;

public class Strings {
    public static boolean isRotationOfEcahOther(String s1, String s2) {
        boolean flag;
        if (s1.length() != s2.length()) {
            flag = false;
        } else {
            String s3 = s1 + s2;
            if (s3.indexOf(s2) != -1) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static void printDuplicateChar(String s) {
        s = s.replace("\\s", "");
        for (int i = 0; i <= s.length() - 1; i++) {
            int count = 0;
            for (int j = 0; j <= s.length() - 1; j++) {
                if (s.charAt(i) == s.charAt(j) && i > j) {
                    break;
                } else if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(s.charAt(i));

            }
        }
    }

    public static void sumNumbers(String str) {
        String temp = "";
        int sum = 0;
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp = temp + str.charAt(i);
                int num = Integer.parseInt(temp);
                while (num > 0) {
                    int rem = num % 10;
                    sum = sum + rem;
                    num = num / 10;
                }
            }
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        System.out.println(isRotationOfEcahOther("java", "aavja"));
        printDuplicateChar("reddy");
        sumNumbers("aa");

    }

}
