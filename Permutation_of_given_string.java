import java.util.*;
public class Main
{
    static void per(char[]arr,int fi,int n){
        if(fi==n-1)
        {
            System.out.println(new String(arr));
            return;
        }
        for(int i=fi;i<n;i++){
            swap(arr,fi,i);
            per(arr,fi+1,n);
            swap(arr,fi,i);
        }
    }
    static void swap(char []arr,int fi,int i){
        char temp=arr[fi];
        arr[fi]=arr[i];
        arr[i]=temp;
    }
    
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char arr[]=str.toCharArray();
		int n=str.length();
		per(arr,0,n);
	}
}
