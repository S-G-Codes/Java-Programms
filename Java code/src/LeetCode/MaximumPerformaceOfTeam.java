import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumPerformaceOfTeam {
    // https://leetcode.com/problems/maximum-performance-of-a-team/
    private class Enginner{
        private int speed;
        private int efficiency;

        public Enginner(int speed, int efficiency){
            this.speed = speed;
            this.efficiency = efficiency;
        }
    }

    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        List<Enginner> enginners = new ArrayList<>();

        for (int i = 0; i < efficiency.length; i++) {
              enginners.add(new Enginner(speed[i], efficiency[i]));
        }

     //sorting the list on base of efficeney desencending

     enginners.sort((a,b) -> b.efficiency - a.efficiency);

     PriorityQueue<Enginner> currentTeam = new PriorityQueue<>((a,b) -> a.speed - b.speed);


     long teamSpeed = 0;
     long maxPerformance = 0;

     for (Enginner newHire : enginners) {
        if(currentTeam.size() ==k){

            Enginner slowGuy = currentTeam.poll();

            teamSpeed -=slowGuy.speed;


        }

        currentTeam.add(newHire);

        teamSpeed += newHire.speed;

        long performaceWithNewGuy = teamSpeed * (long) newHire.efficiency;
        maxPerformance = Math.max(maxPerformance, performaceWithNewGuy);
     }


     return (int) (maxPerformance % 1000000007);
    }
    
    public static void main(String[] args) {
        
    }
}
