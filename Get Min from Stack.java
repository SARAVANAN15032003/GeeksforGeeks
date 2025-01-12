



class GfG
{
   int minEle;
    Stack<Integer> s;
    
    // Constructor    
    GfG()
	{
 s=new Stack<>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	if(s.size()!=0){
	int h=s.get(0);
	for(int i=1;i<s.size();i++){
	    if(h>s.get(i))
	    h=s.get(i);
	}return h;}return -1;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here	
	if(s.size()!=0){
	int u=s.peek();
	s.pop();
	return u;}return -1;//s.get(s.size()-1);
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here	
	s.push(x);
    }	
}
