import java.util.ArrayList;
import java.util.List;

public class CriticalConnection_In_a_Network {
    // https://leetcode.com/problems/critical-connections-in-a-network/

    //Tarjan Mostly ask by Google!

 //Approch 
//1. Do a normal dfs
//2. while traversing mark each node increasing order and keep the all the visted node id's which was marked earlier in an array
//3. After reaching the end come back reverse and compare two node's id to whoever is min assign them that
//4. If you get the same node id then its not a critical connection
//5 But if the node ids are different then its a critical connection store taht in ans list and return


   


    	// TC : O(E)
	private int nextId = 0;

	public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

		List<Integer>[] graph = new ArrayList[n];

		for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

		for(List<Integer> connection :connections) {
			graph[connection.get(0)].add(connection.get(1));
			graph[connection.get(1)].add(connection.get(0));
		}


		List<List<Integer>> ans = new ArrayList<>();
		boolean[] visited = new boolean[n];

		int[] lowestId = new int[n];

		tarjanAlgorithm(graph, -1, 0, visited, ans, lowestId);
		return ans;
	}


	public void tarjanAlgorithm(List<Integer>[] graph, int parentId, int nodeId,  boolean[] visited, List<List<Integer>> ans, int []lowestId) {


		visited[nodeId] = true;

		lowestId[nodeId] = nextId;

		nextId++;

		int currentNodeLowestId = lowestId[nodeId];

		for(int neighbourId : graph[nodeId]) {

			if(neighbourId == parentId) continue;

			if(!visited[neighbourId])  {
				tarjanAlgorithm(graph, nodeId, neighbourId, visited, ans, lowestId);
			}

			lowestId[nodeId] = Math.min(lowestId[nodeId], lowestId[neighbourId]);

			if(currentNodeLowestId < lowestId[neighbourId]) {                                  ans.add(Arrays.asList(nodeId, neighbourId));
			}
		}


	}


    public static void main(String[] args) {
        
    }
}
