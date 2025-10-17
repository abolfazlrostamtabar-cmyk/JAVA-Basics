import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x;
        x= input.nextInt();
        System.out.println();
       for (int i =1;i<=x;i++){
            for(int j=1;j<=i;j++)
                System.out.print("#");
            System.out.println();    
       }
       System.out.println();

       for(int i=1;i<=x;i++){
            if(i==1 ||i==x){
                for(int j=1;j<=x;j++)
                    System.out.print("#");
            
                }
             else{
                for(int z=1;z<=x;z++){
                    if(z==1 || z==x){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
               }
            
            System.out.println();
       }
       System.out.println();

       for(int i=1;i<=x;i++){
            if(i==1 ||i==x){
                for(int j=1;j<=x;j++){
                    if(j==1 ||j==x)
                        System.out.print("#");
                    if(j==x-1)
                    continue;
                    System.out.print(" ");
                }
            }
            else{
                for(int j=1;j<=x;j++){
                    if(j==1 || j==x)
                        System.out.print(" ");
                    else{    
                    System.out.print("#");
                    }
                }
            }
            System.out.println();
       }
        
    }
    
}
