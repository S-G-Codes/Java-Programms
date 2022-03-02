import java.util.*;
import java.lang.*;
import java.io.*;
class Allocate_Minimun_No_Pages{

//     public static int max(int [] a) {
//         int max = 0;
       
//         for(int i=0; i<a.length; i++ ) {
//            if(a[i]>max) {
//               max = a[i];
//            }
//         }
//         return max;
//      }

//      public static int sumofa(int a[])
//     {
//         int sum = 0; // initialize sum
//         int i;
  
//         // Iterate through all elements and add them to sum
//         for (i = 0; i < a.length; i++)
//             sum += a[i];
  
//         return sum;
//     }



// public static boolean isfeasible(int a[] , int k, int res) {
//     int student =1;
//     int sum =0;
//     for (int i = 0; i < a.length; i++) {
//         if(sum + a[i] > res){
//             student++;
//             sum = a[i];
//         }else{
//             sum += a[i];
//         }
//     }
//     return student<=k;                            //shorter format of if else here if k is less than equal to student return true
// }


// public static  int minPages(int a[] , int k) {

    
      
//          int min = max(a);
//          int max = sumofa(a);
//          int res = 0;

//          while(min<=max){
//              int mid = min + (max- min)/2;
//              if(isfeasible(a, k, mid)){
//                  res = mid;
//                  max = mid-1;
//              }else{
//                  min = mid+1;
//              }
//          }
//          return res;
      
     
    
// }



public static void main (String[] args) throws IOException
{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0)
    {
        int n=Integer.parseInt(br.readLine());
        String ss[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(ss[i]);
        }
        int m=Integer.parseInt(br.readLine());
        System.out.println(findPages(a,n,m));
        
    }
//code
}
public static long findPages(int[]a,int n,int m)
{
//Your code here
if(n<m)
{
   return -1;
}
long low=0;  //sabse max wali book kisi ko to ayegi wo hogi min;
long high=0; //saari book ek hi student ko; aur ek hi student tha;
for(int i=0;i<n;i++)
{
   low=Math.max(a[i],low);
   high=high+a[i];
}

long res=-1;
while(low<=high)
{
   long mid=low+(high-low)/2;
   if(allocate(a,n,m,mid))
   {
       res=mid;
       high=mid-1;
   }
   else
   {
       low=mid+1;
   }
}
return res;
}

public static boolean allocate(int a[], int n, int m, long max)
{
long sum=0;
int student=1;
for(int i=0;i<n;i++)
{
   if(a[i]>max)
   {
       return false;
   }
   sum=sum+a[i];
   if(sum>max)
   {
       sum=a[i];
       student++;
   }
   if(student>m)
   {
       return false;
   }
}
return true;
}
}