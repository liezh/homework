import java.util.Scanner;
import java.util.StringTokenizer;


public class Travel {
	
     int n = 0; // ͼ�Ķ�����
     int[] x = null; // ��ǰ��
     int[] bestx = null; // ��ǰ���Ž�
     float bestc = 0; // ��ǰ����ֵ
     float cc = 0; // ��ǰ����
     float[][] a = null; // ��Ӿ���
     String[] adr = new String[300];
     int p;
     int q;
     StringTokenizer adress;
     StringTokenizer st4;
     StringTokenizer st5;
     
     public Travel(int valid){
    	 this.n = valid;
   	 
     }
     
	public void mainTravel(String mGraph){
//		Scanner myscanner = new Scanner(System.in);

		StringTokenizer st4 = new StringTokenizer(mGraph);
		
         bestx = new int[n];
         x = new int[n];
         bestc = -1;
         a = new float[n][n];
// System.out.println("�������ڽӾ���");
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
            	 a[i][j] = Float.valueOf(st4.nextToken());
            //	 a[i][j] = myscanner.nextFloat();
             }
         }
         for (int i = 0; i < n; i++) {
             x[i] = i;
         }
 
         backtrack(1);
 
         System.out.println(bestc+"\n·����");

           for (int j = 0; j < n; j++) { System.out.println(bestx[j]); }
         
	}
    public void backtrack(int i){
        if(i==(n-1)){
            if(a[x[i-1]][x[i]]!=-1&&
                 a[x[i]][x[0]]!=-1&&
                 (bestc==-1||cc+a[x[i-1]][x[i]]+a[x[i]][0]<bestc))
            {
                for(int j=0;j<n;j++)
                    bestx[j]=x[j];
                bestc=cc+a[x[i-1]][x[i]]+a[x[i]][0];
            }
        }    else{
            for(int j=i;j<n;j++){
                if(a[x[i-1]][x[j]]!=-1&&
                        (bestc==-1||cc+a[x[i-1]][x[j]]<bestc)){
                    swap(x,i,j);
                    cc+=a[x[i-1]][x[i]];
                    backtrack(i+1);
                    cc-=a[x[i-1]][x[i]];
                    swap(x,i,j);
                }
            }
        }
    }
    
    public void swap(int[] x, int i, int j) {
        int temp;
        temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }
	
	float getBestx(int i){
		return bestx[i];
	}
	
	float getBestc(){
		return bestc;
	}


}
