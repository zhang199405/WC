package wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class wc {
 public static void main(String[] args) throws IOException {
  int countOfCharacter = 0;
  int countOfWord = 0;
  int countOfLine = 0;
  if (args.length > 0) {
   Reader read = new FileReader(args[0]);
   BufferedReader bufRead = new BufferedReader(read);
   String line = null;
   while ((line = bufRead.readLine()) != null) {
    String[] strs = line.split("\\s");
    for (int i = 0; i < strs.length; i++) {
     countOfWord++;
     countOfCharacter += strs[i].length();
    }
    countOfLine++;
   }
  }
  System.out.println("character: " + countOfCharacter);
  System.out.println("word: " + countOfWord);
  System.out.println("line :" + countOfLine);
 }
}