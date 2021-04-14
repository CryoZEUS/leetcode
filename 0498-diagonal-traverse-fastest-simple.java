class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // edge case
        if(matrix==null || matrix.length==0) return new int[0];
        
        //map to keep diagonals
        Map<Integer,List<Integer>> map =new HashMap<>();
        int max = 0;
        //result array
        int[] res=new int[matrix.length * matrix[0].length];
        
        //iterate through 2D matrix
        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                //check if an element is present
                //if not, add it
                //add elements with i+j same together(same diagonal)
                map.computeIfAbsent(i+j, x -> new ArrayList<>()).add(matrix[i][j]);
                max = Math.max(max, i+j);
            }
        }
        
        int idx = 0;
        //reverse odd rows
        for(int i = 0; i <= max; i++ ) {
            List<Integer> temp = map.get(i);
            if(i % 2 == 0) Collections.reverse(temp);
            for(int num: temp) res[idx++] = num;
        }
        return res;
    }
}