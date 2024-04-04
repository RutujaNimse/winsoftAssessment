/*Merge two arrays by satisfying given constraints
 Given two sorted arrays X[] and Y[] of size m and n each where m>=n and x[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[].i.e. merge(X,Y) by keeping the sorted order*/

import java.util.Arrays;
class MergeArrays{
	public static void mergeArrays(int[]X,int []Y){
		int m=X.length;
		int n=Y.length;

		int xIndex=m-1;
		int vacantIndex=0;

		for(int yIndex=0;yIndex<n;yIndex++){
			while(vacantIndex<m && X[vacantIndex]!=0){
				vacantIndex++;
			}
			if(vacantIndex>=m){
				break;
			}
			X[vacantIndex++]=Y[yIndex];
		}
		Arrays.sort(X);
	}
	public static void printArray(int[] X){
		int m=X.length;
		for(int i=0;i<m;i++){
			System.out.print(X[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[]args){
		int []X={0,2,0,3,0,5,6,0,0};
		int []Y={1,8,9,10,15};

		mergeArrays(X,Y);
		printArray(X);
	}
}


