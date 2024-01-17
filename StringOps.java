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
        System.out.println(capVowelsLowRest("FHjakse"));
        
    }

    public static String capVowelsLowRest (String string) {
        String strrutern = "";
        for(int i = 0; i <= ((string.length()) - 1); i++){
          if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u'){
            strrutern = strrutern + (string.charAt(i) - 32);
          }else if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
            if(string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U'){
                strrutern = strrutern + (string.charAt(i)); 
            }else{
                strrutern = strrutern + (string.charAt(i) + 32);
            }
          }else{
            strrutern = strrutern + (string.charAt(i)); 
          }
        }
        return strrutern;
    }

    public static String camelCase (String string) {
     String strrutern = "";
     int k = 0;
     boolean uppercase = false;
     while((string.charAt(k) + '0') == 127){
     k++;
     }
     for(int i = k; i <= ((string.length()) - (k + 1));){
        if(string.charAt(i) == ' '){
           i++;
           uppercase = true;
        }else{
            if(uppercase = true){
                if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                    strrutern = strrutern + (string.charAt(i));
                    uppercase = false;
                }else{
                    strrutern = strrutern + ((string.charAt(i)) - 32);
                    uppercase = false;
                }
            }else{
                if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){  
                    strrutern = strrutern + ((string.charAt(i)) + 32);
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
                count++;
            } 
        }
        int [] array = new int[count];
        count = 0;
        for(int i = 0; i <= ((string.length()) - 1); i++){
            if(string.charAt(i) == chr ){
              array [count]  = (string.indexOf(i));
              count++;
            } 
        }

        return array;
    }

}