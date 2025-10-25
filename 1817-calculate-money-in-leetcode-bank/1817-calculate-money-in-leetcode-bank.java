class Solution {
    public int totalMoney(int n) {
      int monday=0,c=0,sum=0;

      for(int i=1;i<=n;i++){
        if (c==7)
        {monday=i/7+1;
        c=0;}
        else
        monday++;

        sum+=monday;
        c++;
      }
      return sum;
    

        
    }
}