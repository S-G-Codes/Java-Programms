import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder_II {
    // https://leetcode.com/problems/word-ladder-ii/

    //gives TLE

//  private class Node{
//     public String value;
//     public Node previous;

//     Node(String value){
//         this.value = value;
//     }

//     Node(String value , Node previous){
//         this.value = value;
//         this.previous = previous;
//     }
//  }



//     public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
//         List<List<String>> res = new ArrayList<>();
//         Set<String> list = new HashSet<>(wordList);

//         Queue<Node> q = new LinkedList<>();
//         q.offer(new Node(beginWord));

//         while(!q.isEmpty()){
//             int size = q.size();
//             while(size-- >0){
//                 Node head = q.poll();
//                 for (String  neighborStr : neighbors(list, head.value)) {
//                     Node neighbor = new Node(neighborStr, head);
//                     if(neighbor.value.equals(endWord)){
//                         addNode(res, neighbor);
//                         break;
//                     }
//                     q.offer(neighbor);
//                 }
//             }
//             if(res.size() > 0) break;
//         }
//         return res;
//     }
//     private void addNode(List<List<String>> res, Node p) {
//     LinkedList<String> ladder = new LinkedList<>();
//     while(p!=null){
//         ladder.addFirst(p.value);
//         p = p.previous;
//     }
//      res.add(ladder);
    
    
    
//     }
//     private Set<String>  neighbors(Set<String> list, String s) {
//           list.remove(s);
//           Set<String> res = new HashSet<>();
//           char[] chars = s.toCharArray();
//           for (int i = 0; i < s.length(); i++) {
//                  for (char ch = 'a'; ch <= 'z'; ch++) {
//                      if(chars[i] == ch) continue;
//                      char tmp = chars[i];
//                      chars[i] = ch;
//                      String word = new String(chars);
//                      if(list.contains(word)){
//                         res.add(word);
//                     }
//                     chars[i] = tmp;
//                  }
//                 }
//                 return res;
//     }



class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans = new ArrayList<>(); 
        Map<String, Set<String>> reverse = new HashMap<>(); // reverse graph start from endWord
        Set<String> wordSet = new HashSet<>(wordList); // remove the duplicate words
        wordSet.remove(beginWord); // remove the first word to avoid cycle path
        Queue<String> queue = new LinkedList<>(); // store current layer nodes
        queue.add(beginWord); // first layer has only beginWord
        Set<String> nextLevel = new HashSet<>(); // store nextLayer nodes
        boolean findEnd = false; // find endWord flag
        while (!queue.isEmpty()) { // traverse current layer nodes
            String word = queue.remove();
            for (String next : wordSet) {
                if (isLadder(word, next)) { // is ladder words
					// construct the reverse graph from endWord
                    Set<String> reverseLadders = reverse.computeIfAbsent(next, k -> new HashSet<>());
                    reverseLadders.add(word); 
                    if (endWord.equals(next)) {
                        findEnd = true;
                    }
                    nextLevel.add(next); // store next layer nodes
                }
            }
            if (queue.isEmpty()) { // when current layer is all visited
                if (findEnd) break; // if find the endWord, then break the while loop
                queue.addAll(nextLevel); // add next layer nodes to queue
                wordSet.removeAll(nextLevel); // remove all next layer nodes in wordSet
                nextLevel.clear();
            }
        }
        if (!findEnd) return ans; // if can't reach endWord from startWord, then return ans.
        Set<String> path = new LinkedHashSet<>();
        path.add(endWord);
		// traverse reverse graph from endWord to beginWord
        findPath(endWord, beginWord, reverse, ans, path); 
        return ans;
    }


    private void findPath(String endWord, String beginWord, Map<String, Set<String>> graph,
                                 List<List<String>> ans, Set<String> path) {
        Set<String> next = graph.get(endWord);
        if (next == null) return;
        for (String word : next) {
            path.add(word);
            if (beginWord.equals(word)) {
                List<String> shortestPath = new ArrayList<>(path);
                Collections.reverse(shortestPath); // reverse words in shortest path
                ans.add(shortestPath); // add the shortest path to ans.
            } else {
                findPath(word, beginWord, graph, ans, path);
            }
            path.remove(word);
        }
    }

    private boolean isLadder(String s, String t) {
        if (s.length() != t.length()) return false;
        int diffCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) diffCount++;
            if (diffCount > 1) return false;
        }
        return diffCount == 1;
    }
}
    public static void main(String[] args) {
        
    }
}
