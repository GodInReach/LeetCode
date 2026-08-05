class MinStack {
    Stack<long[]> stk;
    long minn = Integer.MAX_VALUE-1;

    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int value) {
        minn = Math.min(minn,value);
        long[] arr = {value, minn};
        stk.push(arr);
    }
    
    public void pop() {
        stk.pop();
        if(stk.isEmpty()){
            minn = Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        return (int)stk.peek()[0];
    }
    
    public int getMin() {
        return (int)stk.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */