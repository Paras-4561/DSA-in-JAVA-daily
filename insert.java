class insert{
    public static void main(String [] args){
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int n = 5;

        int element = 99;
        int pos = 3;

        for(int i=n; i > pos; i--){
            arr[i] = arr[i - 1];
        }

        arr[pos] =  element;
        n++;

        System.out.println("Array after insertion");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }

        for(int i = 0; i<n; i++){
            
        }
    }
}