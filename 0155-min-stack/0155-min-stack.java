class MinStack {
    private Stack<Integer> s1;
    private Stack<Integer> minStack;

    public MinStack() {
        s1 = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }
        else{
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    
    public void pop() {
        s1.pop();
        minStack.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */