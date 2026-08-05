class MinStack {
    Stack<int[]> stk;
    int minn = Integer.MAX_VALUE;

    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int value) {
        minn = Math.min(minn,value);
        int[] arr = {value, minn};
        stk.push(arr);
    }
    
    public void pop() {
        stk.pop();
    }
    
    public int top() {
        return stk.peek()[0];
    }
    
    public int getMin() {
        return stk.peek()[1];
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