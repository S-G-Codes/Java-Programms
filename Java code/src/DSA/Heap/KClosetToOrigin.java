import java.util.Comparator;
import java.util.PriorityQueue;
//url = https://leetcode.com/problems/k-closest-points-to-origin/
// youtube = https://www.youtube.com/watch?v=IEVbMb473q8

public class KClosettToOrigin {

    public int[][] kClosest(int[][] points, int k) {

        if (points == null)
            return null;

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {

            public int compare(int[] p1, int[] p2) {
                // calculating the distance between a point and origin
                return (p2[0] * p2[0] + p2[1] * p2[1]) - (p1[0] * p1[0] + p1[1] * p1[1]);
            }
        });

        // adding the element in min priority queue
        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
            if (pq.size() > k) { // this for saving some space like imagine you have 100 points and you only need
                                 // first 5 (k) so for that we will take only 5 and reaming remove
                pq.remove();
            }
        }

        // making a 2d array for ans
        int[][] ans = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            ans[i] = pq.remove();
            i++;
        }
        return ans;

    }

    public static void main(String[] args) {

    }
}
