package Collections;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n = scan.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();
        System.out.println("Enter elements in an Array");
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.println("Name : "+player[i].name +" | score : " +player[i].score);
        }
    }
}
