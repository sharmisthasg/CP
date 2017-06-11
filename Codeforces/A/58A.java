import java.io.*;
import java.util.*;

public class q6
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        String s = Reader.next();
        String t = "hello";
        int i = 0;
        int j = 0;
        int counter = 0;
        while (i<s.length() && j<t.length())
        {
            if (s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
                counter++;
            }
            else
            {
                i++;
            }
        }
        if (counter == 5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

class Reader 
{
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static void init(InputStream input) 
    {
        reader = new BufferedReader(new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException 
    {
        while ( ! tokenizer.hasMoreTokens() ) 
        {
            tokenizer = new StringTokenizer(reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException 
    {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException 
    {
        return Double.parseDouble( next() );
    }
}