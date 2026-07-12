class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asteroidStack = new Stack<>();

        for (Integer current : asteroids) {
            boolean currentAlive = true;

            while (currentAlive && !asteroidStack.isEmpty() && 
            asteroidStack.peek() > 0 && current < 0) {
                int top = asteroidStack.peek();

                
                if (Math.abs(top) < Math.abs(current)) {
                    asteroidStack.pop();
                } else if (Math.abs(top) == Math.abs(current)) {
                    asteroidStack.pop();
                    currentAlive=false;
                } else {
                     currentAlive = false;
                }
            }

            if (currentAlive) {
                asteroidStack.add(current);
            }
        }

        int[] leftAsteroid = new int[asteroidStack.size()];

        for (int i = 0; i < asteroidStack.size(); i++) {
            leftAsteroid[i] = asteroidStack.get(i);
        }

        return leftAsteroid;
    }
}