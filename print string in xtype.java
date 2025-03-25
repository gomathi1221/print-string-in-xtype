// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String n="12345";
        char[] c=n.toCharArray();
        int g=c.length;
        int[][] a=new int[g][g];
        for(int i=0;i<c.length;i++){
           int j=i;
                if(i==j){
                    a[i][j]=c[i]-'0';
                }  
        }
        for(int i=0;i<c.length;i++){
            int j=c.length-i-1;
            if(i!=j){
                a[i][j]=c[j]-'0';
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                if(a[i][j]==0){
                    System.out.print(" ");
                }
                else{
                System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}