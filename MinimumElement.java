import java.util.*;
public class MinimumElement {
   
    
    private static int readInteger(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static int[] readElements(int n){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            sc.nextLine();
            array[i]=num;
        }
        return array;
    }
    private static int findMin(int[] a){
    int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
            min=a[i];
        }
        return min;
    }
}  
