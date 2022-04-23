public class Geometric_Mean_Inequality {
    
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

                  int x = 0;
                  int y = 0;

                int arr[] =new int[n];

                for (int i = 0; i < n; i++) {
                      arr[i] = in.nextInt();
                      if(arr[i] == -1){
                          x++;
                      }else{
                          y++;
                      }
                }
                     
                if(n < 3){
                    out.println("NO"); 
                }

                if(Math.abs(x-y) < 2){
                    out.println("YES"); 
                }else if(Math.abs(x-y) ==2){
                    if(x%2 ==0){
                    out.println("YES"); 

                    }else{
                    out.println("NO"); 

                    }
                }else{
                    out.println("NO"); 

                }
    
               
                // Your code here
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
