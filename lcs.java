class LCS{

  int max(int a, int b)
  {
    return (a > b)? a : b;
  }

  int lcs(char []arr1, char []arr2){
    int n=arr1.length;
    int m=arr2.length;
    int M[][]=new int[n+1][m+1];
    int i,j;
    for(i=0;i<=n;i++){
      for(j=0;j<=m;j++){
        if(i==0||j==0){
          M[i][j]=0;
        }
        else if(arr1[i-1]==arr2[j-1]){
          M[i][j]=1+M[i-1][j-1];
        }
        else{
          M[i][j]=max(M[i][j-1],M[i-1][j]);
        }
      }
    }
    return M[n][m];
  }
}

class Main {
  public static void main(String[] args) {
    LCS l = new LCS();
    String s1 = "HALAMADRID";
    String s2 = "ASGARD";
    char[] X=s1.toCharArray();
    char[] Y=s2.toCharArray();
    int m = X.length;
    int n = Y.length;
 
    System.out.println(l.lcs( X, Y ) );
  }
}
