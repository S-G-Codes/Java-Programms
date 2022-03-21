class CarCollision{

// url https://leetcode.com/problems/count-collisions-on-a-road/submissions/
    public int countCollisions(String directions) {
        int count = 0;
        int left = 0;
        int right = directions.length() -1;
        
        while(left < directions.length() && directions.charAt(left) == 'L'){
            left++;
        }
        
        while(right >=0 && directions.charAt(right) == 'R'){
            right--;
        }
        
        for(int i= left ; i<=right;i++){
            if(directions.charAt(i) != 'S'){
                count++;
            }
        }
      
        
    
        
        return count;
    }
    public static void main(String[] args) {
        
    }
}