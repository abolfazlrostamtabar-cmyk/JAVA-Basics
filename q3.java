import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double x,y;
        System.out.println("enter x:");
        x=input.nextDouble();
        System.out.println("enter y:");
        y= input.nextDouble();
        String menu="enter a number  :(1-5)";
        String menu2="1) Add   2)Subtrct  3)Multiply  4)Divide  5)Module";
        System.out.println(menu);
        System.out.println(menu2);
        int z;
        z=input.nextInt();
        switch (z) {
            case 1:System.out.println(x+y);
                
                break;
            case 2:System.out.println(x-y);
                break;
            case 3:System.out.println(x*y);

                break;
            case 4:{
                if(y==0){
                    System.out.println("Error: divide by zero");
                }
                else{
                    System.out.println(x/y);
                }
            }
                break;
            case 5: System.out.println(x%y);
                break;
        
            default:System.out.println("please enter number between(1-5)");
                break;
        }
    }
    
}
