public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        String strrutern = "";
        for(int i = 0; i <= ((string.length()) - 1); i++)
        {
          if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
          {
            strrutern = strrutern + ((char)(string.charAt(i) - 32));
          }
          else if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
          {
            if(string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U')
            {
                strrutern = strrutern + (string.charAt(i)); 
            }
            else
            {
                strrutern = strrutern + ((char)(string.charAt(i) + 32));
            }
          }
          else
          {
            strrutern = strrutern + (string.charAt(i)); 
          }
        }
        return strrutern;
    }

    public static String camelCase (String string) {
     String strrutern = "";
     int k = 0;
     while((string.charAt(k)) == ' '){
     k++;
     }
     if(string.charAt(k) >= 'A' && string.charAt(k) <= 'Z'){  
        strrutern = strrutern + ((char)((string.charAt(k)) + 32));
    }else{
        strrutern = strrutern + (string.charAt(k));
    }
     for( int i = k + 1; i <= (string.length() - 1);i++){
        if(((string.charAt(i))) != ' '){
            if(string.charAt(i-1) == ' '){
                if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                    strrutern = strrutern + (string.charAt(i));
                }else{
                    strrutern = strrutern + ((char)((string.charAt(i)) - 32));
                }
            }else{
                if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){  
                    strrutern = strrutern + ((char)((string.charAt(i)) + 32));
                }else{
                    strrutern = strrutern + (string.charAt(i));
                }

                  
            }
        }
     }
    
    return strrutern;

 }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for(int i = 0; i <= ((string.length()) - 1); i++){
            if(string.charAt(i) == chr ){
                count = count + 1;
            } 
        }
        
        int [] array = new int[count];
        int counttwo = 0;
        for(int i = 0; i <= ((string.length()) - 1); i++){
            if(string.charAt(i) == chr ){
              array [counttwo]  = i;
              counttwo++;
              
            } 
        }

        return array;
    }

}