class QSort{
    public static void main(String[] args){
        int [] arr = {1,34,5,4,6,7,10,23,32,91,45};
        qs(arr,0,arr.length-1);

        for(int i: arr){
            System.out.print(i+" , ");
        }
    }

    static void qs(int[] arr,int low, int high){
        if(low < high){
            int pinx = f(arr,low, high);
            qs(arr,low, pinx-1);
            qs(arr, pinx+1, high);

        }
    }
    static int f(int[] arr, int low, int high){
        int pivot = low;
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i] <= arr[low] && i <= high-1) i++;

            while( arr[j] > arr[low] && j >= low-1) j--;

            if(i<j){
                swap(arr, i,j);
            }

        }
        swap(arr, low,j);
        return j;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }

}