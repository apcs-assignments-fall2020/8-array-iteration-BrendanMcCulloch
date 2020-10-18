public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int [] jojo = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            jojo[i] = arr[arr.length - 1 - i];

        }
        return jojo;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int y, r;
        if (arr[0] > arr[1]){
            y = arr[0];
            r = arr[1];

        }
        else {
            y = arr[1];
            r = arr[0];
        }
        for (int i = 2; i < arr.length; i++){
            if ((arr[i] <= y) && arr[i] > r){
                r = arr[i];
            }
            if (arr[i] > y){
                r = y;
                y = arr[i];
            }
        }
        return r;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double[] factor = new double[arr.length-1];
        for (int i = 0; i < arr.length - 1; i++){
            factor[i] = Double.valueOf(arr[i+1])/Double.valueOf(arr[i]);
        }
        int count = 0;
        for (int i= 1; i < factor.length; i++){
             if (factor[i] == factor[i-1]){
                count +=1; 
            }
        }
        // return true;
        if (count == factor.length -1){
            return true;
        }
        else{
            return false;
        }
    }   


    public static void main(String[] args) {
        System.out.println(reverse(null));
        System.out.println(secondLargest(null));
        System.out.println(isGeometric(null));
    } 
}
