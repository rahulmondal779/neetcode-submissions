class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (visited[current - 'a']) {
                continue;
            }

            while (!stack.isEmpty() && current < stack.peek() && freq[stack.peek() - 'a'] > i) {
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(current);
            visited[current - 'a'] = true;
        }

        StringBuilder string = new StringBuilder();

        for (char c : stack) {
            string.append(c);
        }

        return string.toString();
    }
}