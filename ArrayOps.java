public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        for(int i = 0; i < (array.length - 1);){
            for(int k = 0; k <= array.length;k++){
                if(k == array.length){
                    return i;
                }else{
                    if(i == (array[k])){
                       i++;
                    }
                }
            }
                
        }
            
        
    }

    public static int secondMaxValue(int [] array) {
        int max = 0;
        int secondmax = 0;
        for(int i = 0; i < (array.length - 1); i++){
          max = Math.max((array [i]), max);
        }
        for(int i = 0; i < (array.length - 1); i++){
            if( (array [i])  != max){  
               secondmax = Math.max(array [i] , secondmax);
            }
        }


        return secondmax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
      boolean thefirst = true;
      boolean thesecond = true;
      for(int i = 0; i < ((array1.length) - 1);){
            for(int k = 0; k <= ((array2.length) - 1);k++){
                if(k == array2.length){
                    thefirst = false;
                }else{
                    if(i == (array2 [k] )){
                       i++;
                    }
                }
            }
              
      }
      for(int i = 0; i < ((array2.length) - 1);){
            for(int k = 0; k <= ((array1.length) - 1);k++){
                if(k == array1.length){
                    thesecond = false;
                }else{
                    if(i == (array1 [k])){
                       i++;
                    }
                }
            }
              
      }
      if(thesecond == true && thefirst == true ){
        return true;
      }else{
        return false;
      }
       
    }      


    public static boolean isSorted(int [] array) {
     boolean bigtosmall = true;
     boolean smalltobig = true;
     for(int i = 0; i < ((array.length)- 2);){
        if(((array [i]) >= (array [i+1] ))) {
           i++; 
        }else{
        bigtosmall = false;
        }
     }
     for(int i = 0; i < ((array.length)- 2);){
        if(((array[i])  <= (array [i+1] ))) {
           i++; 
        }else{
        smalltobig = false;
        }
     }
     if (smalltobig == true || bigtosmall == true) {
        return true;
     }else{
        return false;
    }
  }

}
