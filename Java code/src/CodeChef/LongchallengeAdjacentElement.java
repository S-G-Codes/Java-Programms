import java.util.*;
import java.lang.*;
import java.io.*;



public class LongchallengeAdjacentElement {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
	
	
	
	public static int max(int [] a) {
      int max = 0;
     
      for(int i=0; i<a.length; i++ ) {
         if(a[i]>max) {
            max = a[i];
         }
      }
      return max;
   }
	
	
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                // use in to take input
                //  out.println();   this to print
        
               int size = in.nextInt();
                      int a[] = new int[size];
               for(int i =0;i<size ;i++ ){
                   a[i] = in.nextInt();
               } 
               
                int op =0;
                
                for(int i =0; i<size;i++){
                    if(a[i] + a[i+1] == max){
                        a[i] = max;
                        size = size-1;
                    }
                    if(size ==2){
                        a[i] = a[i] + a[i+1];
                        op = op+1;
                    }
                    if(a[i] == a[i] + a[i+1]){
                        return op;
                    }
                    return op;
                }
               
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
