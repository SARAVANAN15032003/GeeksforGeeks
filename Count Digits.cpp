class Solution{
public:
    int evenlyDivides(int N){
        //code here
        int j=N;
        int c=0,l;
        while(N!=0){
            l=N%10; N=N/10;    
            if(l==0)
            continue;
            if(j%l==0)
            c++;
       
        }
        return c;
    }
};
