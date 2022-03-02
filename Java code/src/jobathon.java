import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class jobathon {
         
         
         long specialSum(int m[], int N ) 
    { 
        
       int sum = 0;
       for (int i = 0; i < N; i++) {
             int firstele = m[i];
             int nextEle = m[i+1];

             sum = firstele + nextEle;
       }
       return sum;
     
    } 
    public static void main(String[] args) {
        int [] m = {1,5,3,5,4};
        int N = m.length;
         jobathon obj = new  jobathon();
         obj.specialSum(m, N);
         
    }
}
