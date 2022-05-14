import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class NetworkDelay {
    // https://leetcode.com/problems/network-delay-time/

  private class Node{
      private int target;
      private int distance;

      public Node(int target , int dist){
          this.target = target;
          this.distance = dist;
      }
  }

    public int networkDelayTime(int[][] times, int n, int k) {
        // Min heap PQ

        PriorityQueue<Node> pq = new PriorityQueue<Node>((a,b) -> (a.distance - b.distance));

        //Staring id and connection that exit in graph

        Map<Integer , Set<Node>> map = buildingGraph(times);
        Set<Integer> visited = new HashSet<>();

        pq.offer(new Node(k,0));
    
        int totalTime = 0;

        while(!pq.isEmpty()){
            int size = pq.size();
            while(size-->0){
                Node head = pq.poll();

                if(visited.contains(head.target)){
                    continue;
                }

                visited.add(head.target);

                totalTime = Math.max(totalTime, head.distance);

                if(visited.size() == n){
                    return totalTime;
                }

                if(map.containsKey(head.target)){
                    for(Node children: map.get(head.target)){
                        int childTime = children.distance + head.distance;
                        pq.offer(new Node(children.target, childTime));
                    }
                }
            }
        }
        return -1;
    }

    private Map<Integer, Set<Node>> buildingGraph(int[][] times){
		Map<Integer, Set<Node>> map = new HashMap<>();
		for(int[] time: times){
			map.putIfAbsent(time[0], new HashSet<>());
			map.get(time[0]).add(new Node(time[1] ,time[2]));

		}
		return map;
	}
  public static void main(String[] args) {
      
  }

}
