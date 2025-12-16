import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            showMenu();  
            System.out.print("انتخاب کنید: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> { 
                    System.out.print("دمای سانتی‌گراد را وارد کنید: ");
                    double celsius = input.nextDouble();
                    double fahrenheit = celsius * 1.8 + 32;
                    System.out.printf("فارنهایت = %.2f\n\n", fahrenheit);
                }
                case 2 -> { 
                    System.out.print("دمای فارنهایت را وارد کنید: ");
                    double fahrenheit = input.nextDouble();
                    double celsius = (fahrenheit - 32) / 1.8;
                    System.out.printf("سانتی‌گراد = %.2f\n\n", celsius);
                }
                case 3 -> { 
                    
                    System.out.print("مقدار کیلومتر را وارد کنید: ");
                    double km = input.nextDouble();
                    double miles = km * 0.621371;
                    System.out.printf("مایل = %.2f\n\n", miles);
                }
                case 4 -> { 
                    
                    System.out.print("مقدار مایل را وارد کنید: ");
                    double miles = input.nextDouble();
                    double km = miles / 0.621371;
                    System.out.printf("کیلومتر = %.2f\n\n", km);
                }
                case 0 -> {  
                    
                    System.out.println("خداحافظ!");
                    return;
                }
                default -> System.out.println("گزینه نامعتبر است. دوباره تلاش کنید.\n");
            }
        }
    }

    public static void showMenu() {
        System.out.println("==== منوی تبدیل واحد ====");
        System.out.println("1. سانتی‌گراد ---> فارنهایت");
        System.out.println("2. فارنهایت ---> سانتی‌گراد");
        System.out.println("3. کیلومتر ---> مایل");
        System.out.println("4. مایل ---> کیلومتر");
        System.out.println("0. خروج");
    }
}
