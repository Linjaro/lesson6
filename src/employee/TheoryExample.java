package employee;

import java.util.Scanner;

public class TheoryExample {

    public static void main(String[] args) {
        int x = 12, y= 17;
        System.out.println(x!=y);
        System.out.println(x>=y||x<15);
        System.out.println(x>=y&&x<15);
        
        int score1,score2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter test1: ");
        score1 = s.nextInt();                                           
        System.out.print("Enter test2: ");
        score2 = s.nextInt();     
        boolean bothover90 = score1>=90 && score2 >=90;
        boolean atleast1 = score1>=90 || score2 >=90;
        
    }
    
}
