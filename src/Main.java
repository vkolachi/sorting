public class Main {
    public static void mergeSort(int []arr, int l, int r){
        if(l >= r){
            return;
        }
        int mid= l +(r - l)/2;
        mergeSort(arr, l,mid);
        mergeSort(arr,mid+1, r);
        merge(arr, l,mid, r);
    }
    public static void merge(int[]arr, int l, int m, int r){
        int merge[]=new int[r - l +1];
        int ptr1 = l;
        int ptr2 = m +1;
        int x=0;
        while(ptr1 <= m && ptr2 <= r){
            if(arr[ptr1]<=arr[ptr2]) {
                merge[x++] = arr[ptr1++];
            }
            else
                merge[x++]=arr[ptr2++];
            }
        while(ptr1 <= m){
            merge[x++]=arr[ptr1++];
        }
        while(ptr2 <= r){
            merge[x++]=arr[ptr2++];
        }

        for(int i = 0, j = l; i< merge.length; i++,j++){
            arr[j]=merge[i];
        }


    }
    public static void main(String[] args) {
        int arr[]={1,4,5,0,100,111111,6,1,2};
        mergeSort(arr,0, arr.length-1);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}