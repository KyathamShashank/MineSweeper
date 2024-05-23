package puzzle;

public class MineSweeper_Logic 
{
 public static boolean checkNum(int [][]box,int r, int c)
 {
	 if(box[r][c]%10==0)return true;
	 else 
		 {
		  box[r][c]=0;
		 return false;
		 }
 }
}
