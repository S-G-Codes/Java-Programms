import java.util.PriorityQueue;

public class KweakestSoldier {

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1] );


        for (int i = 0; i < mat.length; i++) {
            minHeap.add(new int[] {i ,search(mat[i])});
        }

        int [] ans  = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = minHeap.poll()[0];
        }
        return ans;
    }

//caluating 1 is matrix

private int search(int[] input){
    int low = 0;
    int high = input.length;
    int mid;

    while(low< high){
        mid = low + (high -low)/2;

        if(input[mid] ==1){
            low = mid+1;
        }else{
            high = mid;
        }
    }
    return low;
}


    public static void main(String[] args) {
        
    }
}
