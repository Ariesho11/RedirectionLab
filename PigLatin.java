import java.util.*;
public class PigLatin{
  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      //use hasNextLine()/nextLine() to loop over
      //all of the data
      System.out.println(pigLatinSimple("mock"));
      System.out.println(pigLatinSimple("pie"));
      System.out.println(pigLatinSimple("david"));
      System.out.println(pigLatinSimple("aaron"));
      System.out.println(pigLatin("the"));
      System.out.println(pigLatin("check"));
      System.out.println(pigLatin("skee"));
      System.out.println(pigLatin("emu"));
      System.out.println(pigLatin("grade"));
      System.out.println(pigLatinBest("*emu"));
      System.out.println(pigLatinBest("4chan"));
      System.out.println(pigLatinBest("fish!"));
      System.out.println(pigLatinBest("fish"));
      System.out.println(pigLatinBest("the."));
      System.out.println(pigLatinBest("cat!"));
      System.out.println(pigLatinBest("amazing?"));
      System.out.println(pigLatinBest("apple%"));
    }
    public static String pigLatinSimple(String s){
      String ns = "";
      char temp = ' ';
        for(int i = 0; i < s.length(); i++){
          if(((temp=='a')||(temp=='e')||(temp=='i')||(temp=='o')||(temp=='u'))&&(i==0)) i++;
          if((i == s.length()-1)&&((temp!='a')||(temp!='e')||(temp!='i')||(temp!='o')||(temp!='u'))){
            temp = s.charAt(0);
            ns = ns + Character.toString(s.charAt(i)) + Character.toString(temp) + "hay";
            }
          else ns = ns + Character.toString(s.charAt(i));
        }
        return(ns);
      }

      public static String pigLatin(String s){
        String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
                            "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
                            "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th",
                            "tr", "tw", "wh", "wr"};
        String ns = "";
        for(int j = 0; j < digraphs.length; j++){
          if(s.substring(0,2).equals(digraphs[j])){
            temp = digraphs[j];
            ns = s.substring(3, s.length()) + temp + "ay";
          }
        }
        if((s.charAt(0)=='a')||(s.charAt(0)=='e')||(s.charAt(0)=='i')||(s.charAt(0)=='o')||(s.charAt(0)=='u')){
          temp = s.substring(0,2);
          ns = s.substring(3, s.length()) + temp + "ay";
        }
        else ns = s.substring(1, s.length()) + s.substring(0,2) + "ay";
        return(ns);
      }

      public static String pigLatinBest(String s){
        String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
                            "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
                            "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th",
                            "tr", "tw", "wh", "wr"};
        String ns = "";
        String temp = "";
        for(int j = 0; j < digraphs.length; j++){
          if(s.substring(0,2).equals(digraphs[j])){
            temp = digraphs[j];
            ns = s.substring(3, s.length()) + temp + "ay";
          }
        }
        if((s.charAt(0)=='a')||(s.charAt(0)=='e')||(s.charAt(0)=='i')||(s.charAt(0)=='o')||(s.charAt(0)=='u')){
          temp = s.substring(0,2);
          ns = s.substring(3, s.length()) + temp + "ay";
        }
        if((s.charAt(0) < 'a') || (s.charAt(0) > 'z')) ns = s;
        else ns = s.substring(1, s.length()) + s.substring(0,2) + "ay";
        return(ns);
      }
    //If you want to read the input word by word
    //this can be replaced with hasNext() and next()
}
