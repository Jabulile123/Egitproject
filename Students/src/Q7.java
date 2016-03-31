
public class Q7 {


	public static void main(String[] args) {
		/*int [] lst = {1,2,3,4,5,4,3,2,1};
		 int sum = 0;
			for(int frnt = 0, rear = lst.length - 1; frnt <5 && rear >=5; frnt++, rear--)
			{
				sum = sum + lst[frnt] + lst[rear];
			}
			System.out.print(sum);*/
		
		
		int row = 10;
		for(; row < 0; ){
			int col = row;
			while(col >=0){
				System.out.println(col + "");
				col -=2;
			}
			row = row /col;
		}
			}
					

	}


