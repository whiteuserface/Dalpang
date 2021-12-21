package dalpang;
public class dalpang {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];

//		------------------------------------------------------
		//けけけけけ1  2  3  4  5  [0][0] [0][1] [0][2] [0][3] [0][4]
		//けけけけけ16 17 18 19 6  [1][0] [1][1] [1][2] [1][3] [1][4]
		//けけけけけ15	24 25 20 7	[2][0] [2][1] [2][2] [2][3] [2][4]
		//けけけけけ14	23 22 21 8  [3][0] [3][1] [3][2] [3][3] [3][4]
		//けけけけけ13 12 11 10 9  [4][0] [4][1] [4][2] [4][3] [4][4]
		int rightCount = 5;
		int downCount = 4;
		int leftCount = 4;
		int upCount = 3;
		int numCount = 1;
		
		int rightFix = 0; //壱舛葵 //廃鯵梢 潅嬢劾 森舛
		int rightMove = 0; //痕疑葵 //廃鯵梢 潅嬢劾 森舛
		
		int downFix = 4; //壱舛葵 // 廃鯵梢 匝嬢級 森舛
		int downMove = 1; //痕疑葵 // 馬蟹梢 潅嬢劾 森舛
		
		int leftFix = 4; //壱舛葵 // 廃鯵梢 匝嬢級 森舛
		int leftMove =3; //痕疑葵 // 廃鯵梢 匝嬢級 森舛
		int leftZeroToOne = 0; 
		
		int upFix = 0; //壱舛葵  //廃鯵梢 潅嬢劾 森舛
		int upMove = 3; //痕疑葵 //廃鯵梢 匝嬢級 森舛
		int upZeroToOne = 1; //段奄拭澗 
		
		
		//奄沙 2腰梢 宜壱 原走厳拭 虞戚闘 廃腰 希 叔楳森舛
		
		for(int k=0; k<3; k++) {
			if(k<=1) {
				//right
				//rightCount 段奄葵 5 [壱舛][装亜] 0-4
				for(int i=rightFix; i<rightFix+1; i++) {
					for(int j=rightMove; j<rightCount; j++) {
//						[0][0] 獣拙 5腰 [1][1] 獣拙 3腰 [2][2] 獣拙 1腰
						arr[i][j] = numCount;
						++numCount;
					}
				}
				rightFix++;
				rightMove++;
				rightCount-=1;
				
				//down
				//downCount 段奄葵 4 [装亜][壱舛] [1][4]
				for(int i=downFix; i<downFix+1; i++) {
					for(int j=downMove; j<=downCount; j++) {
						arr[j][i] = numCount;
						++numCount;
					}
				}
				downFix -= 1;
				downMove += 1;
				downCount-=1;
				
				//left
				//leftCount 段奄葵 4 [壱舛][姶社]
				for(int i=leftFix; i<leftFix+1; i++) {
					for(int j=leftMove; j>=leftZeroToOne; j--) {
						arr[i][j] = numCount;
						++numCount;
					}
					leftZeroToOne +=1;
					leftFix -=1 ;
					leftMove -=1;
					leftCount-=2;
				}
				
				//up
				for(int i=upFix; i<upFix+1; i++) {
					for(int j=upMove; j>=upZeroToOne; j--) {
						arr[j][i] = numCount;
						++numCount;
					}
				}
				upFix+=1;
				upMove-=1;
				upZeroToOne+=1;
				upCount-=1;
			}
			else { //原走厳 虞戚闘 廃腰 希
				//right
				for(int i=rightFix; i<rightFix+1; i++) {
					for(int j=rightMove; j<rightCount; j++) {
//						[0][0] 獣拙 5腰 [1][1] 獣拙 3腰 [2][2] 獣拙 1腰
						arr[i][j] = numCount;
						++numCount;
					}
				}
				rightFix++;
				rightMove++;
				rightCount-=1;
			}
		} 
		
		
		//窒径 姥庚
		for(int q=0; q<arr.length; q++) {
			for(int z=0; z<arr[q].length; z++) {
				System.out.printf("%3d ",arr[q][z]);
			}
			System.out.println();
		}
	}
	
}
			
	
