//Find maximum sum path involving elements of given arrays.
class maximumSumPath{
	public static int maxSumPath(int[]x,int[]y){
		int i=0;
		int j=0;
		int result=0,sumX=0,sumY=0;

		while(i<x.length && j<y.length){
			if(x[i]<y[j]){
				sumX+=x[i++];
			}else if(x[i]>y[j]){
				sumY+=y[j++];
			}else{
				result+=Math.max(sumX,sumY)+x[i];
				i++;
				j++;
				sumX=0;
				sumY=0;
			}
		}
		while(i<x.length){
			sumX+=x[i++];
		}
		while(j<y.length){
			sumY+=y[j++];
		}

		result+=Math.max(sumX,sumY);
		return result;
	}
	public static void main(String[]args){
		int []X={3,6,7,8,10,12,15,18,100};
		int []Y={1,2,3,5,7,9,10,11,15,16,18,25,50};
		System.out.println("The maximum sum path is:"+maxSumPath(X,Y));
	}
}

