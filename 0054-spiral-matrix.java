class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new LinkedList<>(); 
        
        // Edge Case : 
        if (matrix == null || matrix.length == 0) return res;
        
        int n = matrix.length, m = matrix[0].length;
        int up = 0,  down = n - 1;
        int left = 0, right = m - 1;
        
        //Main loop 
        while (res.size() < n * m) {
            
            //Left to Right
            for (int j = left; j <= right && res.size() < n * m; j++)
                res.add(matrix[up][j]);
            
            //Up to Down
            for (int i = up + 1; i <= down - 1 && res.size() < n * m; i++)
                res.add(matrix[i][right]);
            
            //Right to Left         
            for (int j = right; j >= left && res.size() < n * m; j--)
                res.add(matrix[down][j]);
            
            //Down to Up            
            for (int i = down - 1; i >= up + 1 && res.size() < n * m; i--) 
                res.add(matrix[i][left]);
            
            //Remove visited rows / columns
            left++; right--; up++; down--; 
        }
        
        return res;
    }
}