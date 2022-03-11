package capgemini;
//sum of the series
	//1/2+1/3+1/4+1/5....+1/10
public class Arguments {
	void series() {
		float sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+((float)1/i);
		}
		System.out.println("sum="+sum);
		
		
	}
	//0,7,26,.....p terms
	//0,8,27,64
void series(int p) {
	  int s;
	  for(int i=1;i<=p;i++) {
		  //s=(i*i*i)-1;
		  s=(int) (Math.pow(i,3)-1);
		  System.out.print(s+" ");
	  }
	  
}

void series(int x, int n) {
	  double s=0;
	  for(int i=1;i<=n;i++) {
		  s=s+Math.pow(x, i);
	  }
	  System.out.println("sum ="+s);
}



	

	public static void main(String[] args) {
		{
			
			{
				
				 Arguments ob=new  Arguments();
				ob.series();
				ob.series(5);
				System.out.println();
				ob.series(2, 5);
			}
		}
}
}
