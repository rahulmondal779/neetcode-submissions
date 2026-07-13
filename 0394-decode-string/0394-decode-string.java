class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNumber = 0;

        for (Character character : s.toCharArray()) {
            if (Character.isDigit(character)) {
                currentNumber = currentNumber * 10 + (character - '0');
            } else if (character == '[') {
                countStack.add(currentNumber);
                stringStack.add(currentString);

                currentString = new StringBuilder();
                currentNumber = 0;
            } else if (character == ']') {
                int repeatCount = countStack.pop();
                StringBuilder previousString = stringStack.pop();

                for (int i = 0; i < repeatCount; i++) {
                    previousString.append(currentString);
                }
                currentString = previousString;
            } else {
                currentString.append(character);
            }
        }

        return currentString.toString();
    }
}