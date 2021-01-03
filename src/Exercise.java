import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        /* Exercise 1*/
        drawTriangle(10);

        /* Exercise2 */
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));


        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(Arrays.toString(a));
    }

    //Exercise 1: Drawing a Triangle
    public static void drawTriangle(int N){
        int row = 0;
        while (row < N) {
             int col = 0;
             while (col <= row) {
                 System.out.print('*');
                 col = col + 1;
             }
            System.out.println();
            row = row + 1;
         }
    }

    // Exercise 2:Returns the maximum value from m.
    public static int max(int[] m) {
        int maxValue = m[0];  //每一个数都轮流和第一个数比较
        //for loop
        for (int i = 0; i < m.length; i++) {
            if (m[i] > maxValue) {
                maxValue = m[i];
            }
        }
        // while loop
        int i = 0;
        while(i<m.length){
            if(m[i]>maxValue){
                maxValue = m[i];
            }
            i++;
        }
        return maxValue;
    }

    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        for(int i = 0;i<a.length;i++){
            if (a[i]<0){
                continue;
            }
            for(int j = 1;j<=n;j++){
                if(i+j>a.length) break;
                a[i]= a[i]+a[i+j];
            }


        }

    }

}


