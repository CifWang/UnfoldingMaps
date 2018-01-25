package test;
import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {
		int[] vals= {4,24,1,3,13,63};
		int CurrentPos;
		for (int Pos=1;Pos<vals.length;Pos++) {
			CurrentPos=Pos;
			while(CurrentPos>0&&vals[CurrentPos-1]>vals[CurrentPos]) {
				swap(vals,CurrentPos-1,CurrentPos);
				CurrentPos--;
			}
		}
		for(int i=0;i<vals.length;i++) {
			System.out.print(vals[i]+" ");
		}
	}
	public static void swap(int[] unsortedVals, int index1, int index2) {
		int temp;
		temp=unsortedVals[index1];
		unsortedVals[index1]=unsortedVals[index2];
		unsortedVals[index2]=temp;
	}

}
