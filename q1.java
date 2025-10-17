import java.util.Scanner;

public class q1 {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int n ;
    n= input.nextInt();
    double[] arr = new  double[n];
    for (int i =0; i<n; i++){
        arr[i]=input.nextDouble();
    }
   double sum =0;
    for (int i= 0;i<n;i++){
        sum += arr[i];
    }
    System.out.println (sum);
   
    double avg;
    avg= sum /n;
    System.out.println(avg);
     double min = arr[0];
    for(int i=0 ;i<n; i++){
         if(arr[i]<min)
            min = arr[i];
    }
    System.out.println(min);
    double max=arr[0];
    for(int i=0; i<n;i++){
        if(arr[i]>max)
            max=arr[i];
    }
    System.out.println(max);
    
    }
}