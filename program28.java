// Count how many positive, negative, and zero values exist in array.

public class program28 {
    public static void main(String[] args) {
        int arr[] = {2,3,6,0,-5,0,12};

        System.out.print("Array Elements : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int p =0;
        int n =0;
        int z =0;

        for(int i =0; i<arr.length; i++){
           if(arr[i]>0){
            p++;
           }else if(arr[i]<0)
            n++;
           else{
            z++;
           }
        }
        System.out.println();
        System.out.println("Positive : " + p);
        System.out.println("Negative : " + n);
        System.out.println("Zero : " + z);
    }
    
}
