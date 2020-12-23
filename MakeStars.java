import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      //use hasNextLine()/nextLine() to loop over
      //all of the data
      String translate = "";
      while(n.hasNextLine()){
        translate = n.nextLine();
        String ns = "";
        for(int i = 0; i < translate.length(); i++){
          if(translate.charAt(i) != ' ') ns = ns + "*";
          else ns = ns + " ";
        }
        System.out.println(ns);
      }

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
