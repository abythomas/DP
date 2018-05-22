class Knapsack{
  static int max(int a, int b){
    {return (a>b)?a:b;}
  }

  static int kSack(int val[], int wt[], int W){
    int n =val.length;
    int i,j;
    int K[][]=new int[n+1][W+1];
    for(i=0;i<=n;i++){
      for(j=0;j<=W;j++){
        if(i==0||j==0){
          K[i][j]=0;
        }
        else if(wt[i-1]<=j){
          K[i][j]=max(val[i-1]+K[i-1][j-wt[i-1]],K[i-1][j]);
        }
        else{
          K[i][j]=K[i-1][j];
        }
      }
    }
    return K[n][W];
  }
}

class Main {
  public static void main(String[] args) {
    int val[]=new int[]{60,50,5};
    int wt[]=new int[]{10,30,20};
    Knapsack k=new Knapsack();
    int W=50;
    System.out.println(k.kSack(val,wt,W));
  }
}
