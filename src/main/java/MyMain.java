import java.util.Scanner;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] > arr[i]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double[] factor = new double[arr.length-1];
        for (int i = 0; i < arr.length; i++){
            factor[i] = Double.valueOf(arr[i+1])/Double.valueOf(arr[i]);
        }
        int count = 0;
        for (int i= 1; i < factor.length; i++){
             if (factor[i] == factor[i-1]){
                count +=1; 
            }
        }
        return true;
        if (count == factor.length -1){
            return true;
        }
        else{
            return false;
        }
    }   


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("number of values in array");
        int n_1 = scan.nextInt();
        int arr_1[] =  new int[n_1];
        System.out.println("enter all the elements: ");
        for (int i = 0; i < n_1; i++){
            arr_1[i] = scan.nextInt();
        }
        System.out.println(reverse(arr_1));
        System.out.print("number of values in array");
        int n_2 = scan.nextInt();
        int arr_2[] =  new int[n_2];
        System.out.println("enter all the elements: ");
        for (int i = 0; i < n_2; i++){
            arr_2[i] = scan.nextInt();
        }
        System.out.println(secondLargest(arr_2));
        System.out.print("number of values in array");
        int n_3 = scan.nextInt();
        int arr_3[] =  new int[n_3];
        System.out.println("enter all the elements: ");
        for (int i = 0; i < n_3; i++){
            arr_2[i] = scan.nextInt();
        }
        System.out.println(isGeometric(arr_3));
        
        scan.close();
    } 
}
