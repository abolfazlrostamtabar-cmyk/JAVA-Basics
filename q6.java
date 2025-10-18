import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i!=minIndex){
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            }
        }

            for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    
        int t = input.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == t) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}

