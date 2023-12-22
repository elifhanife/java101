import java.io.*;
import java.util.*;

public class JavaDatatypesHRExercise {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long n = 0;
        for(int i=0; i<t; i++){
            try{
                n = scan.nextLong();
                System.out.println(n + " can be fitted in:");

                if(n>=-128 && n<=127){
                    System.out.println("* byte\n* short\n* int\n* long");
                }
                else if(n>=-32768 && n<=32767){
                    System.out.println("* short\n* int\n* long");
                }
                else if(n>=-2147483648 && n<=2147483647){
                    System.out.println("* int\n* long");
                }
                else if(n>=-9223372036854775808L &&
                        n<=9223372036854775807L){
                    System.out.println("* long");
                }
            } catch(Exception e){
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
    }
}
