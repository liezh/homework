import java.util.StringTokenizer;


public class Package {
	final static int MAX = 1000;
	int[] wight = new int[MAX];
	int[] value = new int[MAX];
	int[] number = new int[MAX];
	int[] way = new int[MAX];
	int[] be = new int[MAX];
	int N,M;                //N---物品数量        M---背包容量
	double cw,cv,bestv,LV;
	public Package(String mValue,String mWight,int n,int cap){
		int i = 0;
		String s1,s2;
		StringTokenizer st1 = new StringTokenizer(mValue);
		StringTokenizer st2 = new StringTokenizer(mWight);
		System.out.println("000000000"+cap);

		while(st1.hasMoreElements()){
			s1 = st1.nextToken();
			s2 = st2.nextToken();
			this.value[i] = Integer.valueOf(s1);
			this.wight[i] = Integer.valueOf(s2);
			this.number[i] = i;

			System.out.println("------"+this.wight[i]);
			System.out.println("++++++"+this.value[i]);
			i++;
		}
		this.N = n;
		this.M = cap;
		this.mainPackage();
	}
	
	void mainPackage(){
//		M = 0;
		cw = cv = 0;
		bestv = LV = 0;
		
		
		backTrack(0);    //回溯调用
		for(int i=0;i<N;i++){
			if(be[i] == 1)
				System.out.println("物品"+(i+1)+"放入！！");	
		}
		System.out.println("总价值"+bestv);
	}

	

	private void backTrack(int i) {
		// TODO 自动生成的方法存根
		int k;
		if(i >= N){
			bestv = cv;
			if(bestv > LV){
				for(k = 0; k<N ; k++){
					be[k] = way[k];
				}
				LV = bestv;
			}
			return;
		}
		//回溯处理
		if(cw + wight[i] <= M){
			cw+=wight[i];
			cv+=value[i];
			way[number[i]]=1;
			backTrack(i+1);
			cw-=wight[i];
			cv-=value[i];
			way[number[i]]=0; 

		}
		//剪支
		if(bound(i+1) > bestv)
			backTrack(i+1);
		
		
	}

	private double bound(int i) {
		// TODO 自动生成的方法存根
		double syw,bv;
		syw = M-cw;
		bv = cv;
		while(i<=N && wight[i] <= syw){
			syw -= wight[i];
			bv += value[i];
			i++;
		}
		
		if(i <= N){
			bv += syw*1.0*value[i]/wight[i];
		}
		return bv;

	}
	
	int getBe(int i){
		
		return be[i];
	}
	double getBestv(){
		return bestv;
	}

	



}
