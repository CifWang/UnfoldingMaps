package test;

public class selectionSort {
	public static void selectionSort(int[] vals) {
		int indexMin;
		for(int i=0;i<vals.length-1;i++) {
			indexMin=i;
			for(int j=i+1;j<vals.length;j++) {
				if(vals[j]<vals[indexMin]) {
					indexMin=j;
				}
			}
			swap(vals,indexMin,i);
			
		}
		for(int i=0;i<vals.length;i++) {
			System.out.print(vals[i]);
		}
	}
	public static void swap(int[] unsortedVals, int index1, int index2) {
		int temp;
		temp=unsortedVals[index1];
		unsortedVals[index1]=unsortedVals[index2];
		unsortedVals[index2]=temp;
		
	}

	public static void main(String[] args) {
		int[] num= {1,3,2,6,9,18,4};
		selectionSort(num);
	}
}
