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
    //If you want to read the input word by word
    //this can be replaced with hasNext() and next()
}
