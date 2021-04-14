class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        //Check for edge cases
        if(mat == null || mat.length == 0) return new int[0];
        
        //Tracking Matrix size :
        int N = mat.length;
        int M = mat[0].length;
        
        //array to return
        int[] result = new int[M*N];
        //dynamic array for diagonals
        ArrayList<Integer> intermediate = new ArrayList<>();
        int k = 0;
        
        //go through all elements in first row
        //and through all elements in last column to cover all diagonals
        for(int d = 0; d < M + N - 1; d++) {
            
            //clear intermediate before processing new diagonal
            intermediate.clear();
            
            //find the head of the diagonal
            int r = d < M ? 0 : d - M + 1;
            //elements in first row and last column are heads
            int c = d < M ? d : M - 1;
            
            // Iterate through the diagonal until one of the indices is out of scope
            //note how index changes over a diagonal
            while(r < N && c > -1) {
                intermediate.add(mat[r][c]);
                ++r;
                --c;
            }
            
            // Reverse even numbered diagonals
            //(numbering here starts from 0, not 1)
            if(d % 2 ==0) {
                Collections.reverse(intermediate);
            }
            
            for(int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
            
        }
        
        return result;
        
    }
}