class RecentCounter {
    public Deque<Integer> deque = new ArrayDeque<>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        int start = t - 3000;
        deque.addLast(t);
        while (deque.peekFirst() < start) {
            deque.removeFirst();
        }

        return deque.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */