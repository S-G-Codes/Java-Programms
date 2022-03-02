public class TowerofHonai {


  public static void towerOfHonai(int n , String src, String helper, String Desc) {       //Taking four paramters n as no of disk, Src as source , helper as Helper , Desc as Destination
     if(n==1){        //base cond as if disk is one directly transferred it to Desc from source
         System.out.println("Transfered disk" + n + "from " + src + "to" + Desc + "Successfully");
         return;
     }  

     towerOfHonai(n-1, src, Desc, helper); //first recursion taking n-1 disk and putting it into helper (as new temporary desc) from source with using desc (as our new temp helper)
     System.out.println("Transfered disk" + n + "from " + src + "to" + Desc + "Successfully");
   towerOfHonai(n-1, helper, src, Desc);//second recursion taking n-1 disk and putting it into desn  from helper with using src (as our new temp helper)


  }


    public static void main(String[] args) {
        int n =3;          //taking n as three 
        towerOfHonai(n, "S", "H", "D");       //passing our paramters 
    } 
}


//Time Complexity of this code
//   O(2 raised to n-1) i.e approx O(2 raised to n).