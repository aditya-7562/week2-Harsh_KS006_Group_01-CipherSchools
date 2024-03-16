class pair{
    long first, second;
    public pair(long first, long second){
        this.first = first;
        this.second = second;
    }
}

class Compute{
    static pair getMinMax(long[] arr, long n){
        long min = arr[0];
        int minIndex = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }

        long max = arr[0];
        int maxIndex = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Min found at: " + (minIndex + 1) + ". Max found at: " + (maxIndex + 1));

        return new pair(min,max);
    }
}

public class class26 {
    public static void main(String[] args) {
        
    }
}
