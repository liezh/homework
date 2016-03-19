import java.util.StringTokenizer;


public class Package {
	final static int MAX = 1000;
	int[] wight = new int[MAX];
	int[] value = new int[MAX];
	int[] number = new int[MAX];
	int[] way = new int[MAX];
	int[] be = new int[MAX];
	int N,M;                //N---��Ʒ����        M---��������
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
		
		
		backTrack(0);    //���ݵ���
		for(int i=0;i<N;i++){
			if(be[i] == 1)
				System.out.println("��Ʒ"+(i+1)+"���룡��");	
		}
		System.out.println("�ܼ�ֵ"+bestv);
	}

	

	private void backTrack(int i) {
		// TODO �Զ����ɵķ������
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
		//���ݴ���
		if(cw + wight[i] <= M){
			cw+=wight[i];
			cv+=value[i];
			way[number[i]]=1;
			backTrack(i+1);
			cw-=wight[i];
			cv-=value[i];
			way[number[i]]=0; 

		}
		//��֧
		if(bound(i+1) > bestv)
			backTrack(i+1);
		
		
	}

	private double bound(int i) {
		// TODO �Զ����ɵķ������
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
