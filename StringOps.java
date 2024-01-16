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
        for(int i = 0; i < ((string.length()) - 1); i++){
          if(string.charAt(i) == 'a'|| string.charAt(i) == 'e'|| string.charAt(i) == 'i'|| string.charAt(i) == 'o'|| string.charAt(i) == 'u'){
            strrutern = strrutern + (string.charAt(i) - 32);
          }else{
           strrutern = strrutern + (string.charAt(i)); 
          }
        }
        return strrutern;
    }

    public static String camelCase (String string) {
     String strrutern = "";
     for(int i = 0; i < ((string.length()) - 1);){
        if(string.charAt(i) == ' '){
           i++;
        }else{
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                strrutern = strrutern + ((string.charAt(i)) + 32);
            }else{
                strrutern = strrutern + (string.charAt(i));
            }
        }
     }
        return strrutern;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for(int i = 0; i < ((string.length()) - 1); i++){
            if(string.charAt(i) == chr ){
                count++;
            } 
        }
        int [] arr = new int[count];
        for(int i = 0; i < ((string.length()) - 1); i++){
            if(string.charAt(i) == chr ){
              arr [i]  = (string.indexOf(i));
            } 
        }

        return arr;
    }
}
