package dalpang;
public class dalpang {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];

//		------------------------------------------------------
		//����������1  2  3  4  5  [0][0] [0][1] [0][2] [0][3] [0][4]
		//����������16 17 18 19 6  [1][0] [1][1] [1][2] [1][3] [1][4]
		//����������15	24 25 20 7	[2][0] [2][1] [2][2] [2][3] [2][4]
		//����������14	23 22 21 8  [3][0] [3][1] [3][2] [3][3] [3][4]
		//����������13 12 11 10 9  [4][0] [4][1] [4][2] [4][3] [4][4]
		int rightCount = 5;
		int downCount = 4;
		int leftCount = 4;
		int upCount = 3;
		int numCount = 1;
		
		int rightFix = 0; //������ //�Ѱ��� �þ ����
		int rightMove = 0; //������ //�Ѱ��� �þ ����
		
		int downFix = 4; //������ // �Ѱ��� �پ�� ����
		int downMove = 1; //������ // �ϳ��� �þ ����
		
		int leftFix = 4; //������ // �Ѱ��� �پ�� ����
		int leftMove =3; //������ // �Ѱ��� �پ�� ����
		int leftZeroToOne = 0; 
		
		int upFix = 0; //������  //�Ѱ��� �þ ����
		int upMove = 3; //������ //�Ѱ��� �پ�� ����
		int upZeroToOne = 1; //�ʱ⿡�� 
		
		
		//�⺻ 2���� ���� �������� ����Ʈ �ѹ� �� ���࿹��
		
		for(int k=0; k<3; k++) {
			if(k<=1) {
				//right
				//rightCount �ʱⰪ 5 [����][����] 0-4
				for(int i=rightFix; i<rightFix+1; i++) {
					for(int j=rightMove; j<rightCount; j++) {
//						[0][0] ���� 5�� [1][1] ���� 3�� [2][2] ���� 1��
						arr[i][j] = numCount;
						++numCount;
					}
				}
				rightFix++;
				rightMove++;
				rightCount-=1;
				
				//down
				//downCount �ʱⰪ 4 [����][����] [1][4]
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
				//leftCount �ʱⰪ 4 [����][����]
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
			else { //������ ����Ʈ �ѹ� ��
				//right
				for(int i=rightFix; i<rightFix+1; i++) {
					for(int j=rightMove; j<rightCount; j++) {
//						[0][0] ���� 5�� [1][1] ���� 3�� [2][2] ���� 1��
						arr[i][j] = numCount;
						++numCount;
					}
				}
				rightFix++;
				rightMove++;
				rightCount-=1;
			}
		} 
		
		
		//��� ����
		for(int q=0; q<arr.length; q++) {
			for(int z=0; z<arr[q].length; z++) {
				System.out.printf("%3d ",arr[q][z]);
			}
			System.out.println();
		}
	}
	
}
			
	
