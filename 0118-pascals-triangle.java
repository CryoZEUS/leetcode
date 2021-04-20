class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int n = numRows;
        //init list of list
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        //edge case
        if(n == 0) return res;
        
        //first element always 1
        res.add(new ArrayList<>());
        res.get(0).add(1);
        
        //outer loop
        for(int i = 1; i < n; i++) {
            
            //lists for current row and previous row
            List<Integer> listAtI = new ArrayList<>();
            List<Integer> listAtIminusOne = res.get(i-1);
            
            //first element of row is always 1
            listAtI.add(1);
            
            //inner loop    
            for(int j = 1; j < i; j++) {
                
                listAtI.add(listAtIminusOne.get(j-1) + listAtIminusOne.get(j));
            }
            //Last element is always 1
            listAtI.add(1);
            //add list to list of list
            res.add(listAtI);
        }
        
        return res;
    }
}
