import java.io.*;
import java.util.*;

public class q10
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        String s = Reader.next();
        int count = 0;
        for (int i = 0; i<s.length() - 1; i++)
        {
            if (s.charAt(i) == s.charAt(i + 1))
            {
                count++;
                if (count == 6)
                {
                    System.out.println("YES");
                    break;
                }
            }
            else
            {
                count = 0;
            }
        }
        if (count != 6)
        {
            System.out.println("NO");
        }
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