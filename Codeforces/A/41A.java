import java.io.*;
import java.util.*;

public class q4
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        String s = Reader.next();
        String t = Reader.next();
        int count = 0;
        for (int i = 0; i<s.length(); i++)
        {
            if (s.charAt(i) == t.charAt(t.length() - i - 1))
            {
                count++;
            }
            else
            {
                System.out.println("NO");
                break;
            }
        }
        if (count == s.length())
            System.out.println("YES");
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