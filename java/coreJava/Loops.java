package coreJava;


import java.util.Scanner;

public class Loops {

    public static void forLoop1() {
        System.out.println("For Loop");
        System.out.println("Enter number of Rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println("Enter X value");
        int x = scan.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }

    public static void forLoop2() {
        System.out.println("For Loop");
        System.out.println("Enter number of Rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println("Enter X value");
        int x = scan.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(x + " ");
                x = x + 2;
            }
            System.out.println();
        }
    }

    public static void forLoop3() {
        System.out.println("For Loop");
        System.out.println("Enter number of Rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println("Enter X value");
        int x = scan.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(x + " ");
                x = x + 3;
            }
            System.out.println();
        }
    }

    public static void whileLoop1() {
        System.out.println("While Loop");
        System.out.println("Enter number of Rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println("Enter X value");
        int x = scan.nextInt();
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j < i) {
                System.out.print(x + " ");
                x++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void whileLoop2() {

        System.out.println("While Loop");
        System.out.println("Enter number of Rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println("Enter X value");
        int x = scan.nextInt();
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j < i) {
                System.out.print(x + " ");
                x = x + 2;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void whileLoop3() {
        System.out.println("While Loop");
        System.out.println("Enter number of Rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println("Enter X value");
        int x = scan.nextInt();
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j < i) {
                System.out.print(x + " ");
                x = x + 3;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void doWhileLoop() {
        int n =4;
        int i =1;
        int x = 1;
       do {
           int j =1;
           while(j<i){
               System.out.print(x + " ");
               x++;
               j++;
           }
           System.out.println();
           i++;
       }while(i<=n);
    }

    public static void main(String[] args) {
        // forLoop2();
        //whileLoop2();
        doWhileLoop();
    }
}
