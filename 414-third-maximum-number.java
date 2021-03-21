class Solution {
    public int thirdMax(int[] nums) {
        
        
        
        //since any value can be assigned we can't use Integer.MIN_VALUE/Integer.MAX_VALUE
        //To define a value null,You need to have an object so we use UNteger class rather
        //than int "primitive datatype"
        Integer max=null;Integer sec_max=null; Integer third_max=null;
        
        
        for(Integer num:nums)
        {     
            //duplicates case handled
           if(num.equals(max) || num.equals(sec_max) || num.equals(third_max))
           { 
               continue;
           }    
           if(max == null || num > max  )
           {   
               third_max=sec_max;
               sec_max=max;
               max=num;
           }
            else if(sec_max==null || num>sec_max)
            {
                third_max=sec_max;
                sec_max=num;                
            }
            else if(third_max==null || num>third_max)
            {
                third_max=num;
            }
        }
        
        System.gc();
        
        //Important Return statements:
           if(third_max==null)
               return max;
          else 
              return third_max;
    }
}