class Solution {
    // Correctly initialize the directions array
    public int[][] directions = {
        {0, 1},  // EAST
        {1, 0},  // SOUTH
        {0, -1}, // WEST
        {-1, 0}  // NORTH
    };

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2]; // Result array to store the path
        int steps = 0; // Number of steps to take in the current direction
        int dir = 0;   // Current direction index (0: East, 1: South, 2: West, 3: North)
        int index = 0; // Index for the result array

        // Initialize the first position
        result[index++] = new int[]{rStart, cStart};

        while (index < rows * cols) {
            if (dir == 0 || dir == 2) { // Increase steps after every two turns
                steps++;
            }
            for (int count = 0; count < steps; count++) {
                // Move in the current direction
                rStart += directions[dir][0];
                cStart += directions[dir][1];

                // Check if the new position is within bounds
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    // Add the new position to the result array
                    result[index++] = new int[]{rStart, cStart};
                }
            }

            // Change direction clockwise
            dir = (dir + 1) % 4;
        }

        return result;
    }
}
