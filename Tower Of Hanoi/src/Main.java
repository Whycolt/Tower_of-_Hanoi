
/**
 * name: Colt Ma 
 * teacher: Mrs.Strelkovska
 * course: ICS4U
 * date: Dec 6, 2016
 * Assignment: Tower Of Hanoi
 * Description: Use recursion to solve tower of hanoi 
 */
public class Main {
	
	public static void main(String[] args){
		solve(1,2,3,5);
	}
	
	//
	public static void solve(int start,int mid,int end, int ring){
		//base case
		if (ring == 1)
			System.out.println("Move ring on pole " + start + " to pole " + end);
		else{
			//finding how to get to current step
			solve(start,end,mid,ring-1);
			System.out.println("Move ring on pole " + start + " to pole " + end);
			//doing next previous step
			solve(mid, start,end,ring-1);
		}
			
	}

}
