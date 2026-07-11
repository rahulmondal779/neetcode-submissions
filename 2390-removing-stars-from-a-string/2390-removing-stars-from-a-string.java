class Solution {
    public String removeStars(String s) {
        if (s.length()==0) {
            return "";
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if (!stack.isEmpty() && stack.peek().equals('*')) {
                stack.pop();
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }

        return sb.toString();
    }
}