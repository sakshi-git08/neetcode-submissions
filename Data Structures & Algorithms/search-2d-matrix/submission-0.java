class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int r = binarySearchRowSelect(matrix, target);

        if (r == -1) {
            return false;
        }

        return binarySearch(matrix, r, target);
    }

    // Step 1: Identify the possible row
    public int binarySearchRowSelect(int[][] matrix, int target) {

        int lo = 0;
        int hi = matrix.length - 1;
        int lc = matrix[0].length - 1;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (matrix[mid][0] <= target && target <= matrix[mid][lc]) {
                return mid;
            }
            else if (target > matrix[mid][lc]) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        return -1;
    }

    // Step 2: Binary search inside the selected row
    public boolean binarySearch(int[][] matrix, int r, int target) {

        int lo = 0;
        int hi = matrix[r].length - 1;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (matrix[r][mid] == target) {
                return true;
            }
            else if (matrix[r][mid] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        return false;
    }
}