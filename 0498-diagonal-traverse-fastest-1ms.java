class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        int m = matrix.length; // rows = 3
        int n = matrix[0].length; // cols = 3
        int total = m * n;
        int[] result = new int[total];
        int k = 0;
        boolean up = true;
        int r = 0;
        int c = 0;
        m = m-1;
        n = n-1;
        
        while(k < total){
            
            if(up){
                
                while(r > 0 && c < n){
                 int x = matrix[r][c];
                 result[k++] = x;
                 r--;
                 c++;
                }
                int x = matrix[r][c];
                result[k++] = x;
                
            
                    
                    if(c == n){
                       r++; 
                    }else{
                      c++;  
                    }
                
                
                up = false;
                
            }else{
                
                
                while(r < m && c > 0){
                 int x = matrix[r][c];
                 result[k++] = x;
                 r++;
                 c--;
                }
                
                int x = matrix[r][c];
                 result[k++] = x;
                
                 if(r == m){
                       c++; 
                    }else{
                      r++;  
                    }
                 
                    
                    
                up = true;
            }  
              
        }
        return result;
        
    }
}