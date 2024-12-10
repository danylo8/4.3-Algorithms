
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

    public class Algorithms {
        private static File f;
        private static Scanner s;
        public static void main(String[] args) throws FileNotFoundException {
            f = new File("words.txt");
            int twoLetter = twoLetter();
            int tiedLongestWord=tiedLongestWord();

            System.out.println(twoLetter);
            System.out.println(tiedLongestWord);
        }


            public static int twoLetter() throws FileNotFoundException {
                s = new Scanner(f);
                int twoLetter = 0;
                while (s.hasNext()) {

                    if (s.next().length() == 2) {
                        twoLetter++;
                    }


                }

                return twoLetter;

            }

            public static int tiedLongestWord() throws FileNotFoundException {
                s = new Scanner(f);
                int tiedLongestWord = 0;
                int lengthOfWord=0;

                while (s.hasNext()) {

                    if (s.next().length()>lengthOfWord) {
                        lengthOfWord=(s.next().length());
                        tiedLongestWord=1;
                    }

                    else if ((s.next().length())==lengthOfWord)
                    {
                        tiedLongestWord++;
                    }


                }

                    return tiedLongestWord;
        }
            public static int palindrome() throws FileNotFoundException {
                s = new Scanner(f);
                return 0;
            }

}
