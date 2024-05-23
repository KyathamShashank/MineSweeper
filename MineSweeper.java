package puzzle;
import java.util.Scanner;

public class MineSweeper 
{
 public static void main(String[] args)
 {
	 
  System.out.println("Rules");
  System.out.println("Enter the index values to select the coresponding box");
  System.out.println("EX: if you want to select 1st box enter 0 0 or if you and 2nd box enter 0 1 ");
  System.out.println("Bomb is there in the  box in which that number is divisible by 0 (10,20,30.....)");
  int box[][]= new int[5][5];
  boolean gameOver=false;
  
  for(int r=0;r<5;r++)
  {
	  for(int c=0;c<5;c++)
	  {
	   box[r][c]=(int)(Math.random()*100);
	  }
  }
  
  
  for(int r=0;r<5;r++)
  {
	  for(int c=0;c<5;c++)
	  {
		System.out.print(box[r][c]+" |");
	  }
	  System.out.println();
	  System.out.println("--------------------");
  }
  
  
  int score=0;
  while(!gameOver)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter position");
	  int r=sc.nextInt();
	  int c=sc.nextInt();
	  if(box[r][c]==0)System.out.println("Invalid move Try Again");
	  else
	  {
		  if(MineSweeper_Logic.checkNum(box, r, c))
		  {
			 gameOver=true;
			 System.out.println("GAME OVER ||  SCORE: "+score);
		  }
		  else
		  {
			score=score+10;  System.out.println("SCORE: "+score);
		  }  
	  }
	  
    }
  
  
  
  
  for(int r=0;r<5;r++)
  {
	  for(int c=0;c<5;c++)
	  {
		System.out.print(box[r][c]+" |");
	  }
	  System.out.println();
	  System.out.println("--------------------");
  }
  
 }
}
