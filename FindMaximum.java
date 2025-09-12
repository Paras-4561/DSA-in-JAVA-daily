public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 55, 99, 44, 67, 56, 44};

        int max = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
            
        }

        System.err.println(max);
    }
    
}
