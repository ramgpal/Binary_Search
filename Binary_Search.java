/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int Binary_Search(int num[], int key) {
        int start=0, end=num.length-1;
        while(start<=end) {
            int mid=(start+end)/2;
            //comparison
            if(num[mid]==key) {
                return mid;
            }
            else if (num[mid]<key) {
                start=mid+1;
            }
            else
            end=mid-1;
        }
        return-1;
    }
	public static void main(String[] args) {
	    int num[]={2,4,6,8,10,12,14,16,18,10};
	    int key=12;
		System.out.println(Binary_Search(num,key));
	}
}
