/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam;
import java.util.Scanner;
/**
 *
 * @author s
 */
public class Codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
                //System.out.println(arr[i]);
            }
            int Total = Reversort(arr);
            int j = i+1;
            System.out.println("Case #" + j + ": " + Total);
        }
        
    }
    private static int Reversort(int arr[]){
        int j = 0,count=0,i;
        for(i=0;i<arr.length-1;i++){
            j=i;
            for(int n = i ;n<arr.length;n++){
                if( arr[j]>arr[n]){
                    j=n;
                }
            }
            count = count + Math.abs(j+1-i);
            Reverse(arr,i,j);
        }
        return count;
    }
    private static void Reverse(int arr[],int l, int j){
        int  temp,i=l;
         while (i < j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }    
}
