import java.util.Scanner;
public class length {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Type any word you want?!");
       String j = sc.nextLine();
       int y = j.length();
       System.out.println(y);
       System.out.println(j + " has exactly " + y + " letters");
       boolean isEven = y % 2 == 0;
       if (isEven){
           System.out.println("YOU WIN!!! Your Word Has An Even Amount of Letters!!!");
       } else {
           System.out.println("BETTER LUCK NEXT TIME :(");
       }
   }
}

