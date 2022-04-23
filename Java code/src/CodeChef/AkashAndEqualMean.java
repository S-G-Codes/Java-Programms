import java.util.HashMap;

public class AkashAndEqualMean {
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
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                // use in to take input
                //  out.println();   this to print
                  int n = in.nextInt();

                  int arr[] = new int[n];
          double   SumofAll = 0;
                  for (int i = 0; i < n; i++) {
                       arr[i] = in.nextInt();
                       SumofAll += arr[i];
                  }
               double Nmean = (double) SumofAll/n;
               Nmean *=2;

               if(Nmean != (int)Nmean){
                   out.println(0);
               }else{
                   HashMap<Integer, Integer> map = new HashMap<>();

                   long ans  =0 ;
                   int target = (int)Nmean;
                   for (int i = 0; i < n; i++) {
                       if(map.containsKey(target-arr[i] )) ans+= map.get(target - arr[i]);
                       map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
                   }
                   out.println(ans);
               }

               
                // Your code here
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

}
