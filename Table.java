
package quiz;

import java.util.Scanner;
public class Table{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       
       System.out.println("ENTER THE NUMBER  : ");
       
       Integer number = input.nextInt();
       System.out.println("ENTER TILL NUMBER : ");
       Integer till = input.nextInt();
       
       for(int i=1;i<=till;i++){
           System.out.println(number +" * " + i + " = " + number*i);
       }
    }
