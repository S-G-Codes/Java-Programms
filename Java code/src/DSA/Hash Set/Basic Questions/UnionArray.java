public class UnionArray {

//url https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1#
    public static int doUnion(int a[], int n, int b[], int m) 
    {
       HashSet<Integer> s  = new HashSet<Integer>(n+m);
       for(int element1 : a){
            s.add(element1);
       }
       
        for(int element2: b){
            s.add(element2);
       }
       
       return s.size();
    }

//Iterator way

    // int doUnion(int a[], int n, int b[], int m)  {
    //     //code here
    //     int sum =0;
    //     int arr[100000]={0};
    //     for(int i =0;i<n;i++)
    //     {
    //         arr[a[i]]=1;
    //     }
    //     for(int j =0;j<m;j++)
    //     {
    //         arr[b[j]]=1;
    //     }
    //     for(int k =0;k<100000;k++)
    //     {
    //          sum = arr[k]+sum;
    //     }
    //     return sum;
    // }
   public static void main(String[] args) {
       
   } 
}
