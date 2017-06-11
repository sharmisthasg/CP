import java.io.*;
import java.util.*;

public class q9
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int x = Reader.nextInt();
        for (int i = 0; i<x; i++)
        {
            String s = Reader.next();
            if (s.length() < 10)
                System.out.println(s);
            else
            {
                int count = 0;
                for (int j = 1; j<s.length() - 1; j++)
                {
                    count++;
                }
                System.out.println(s.charAt(0) + Integer.toString(count) + s.charAt(s.length() - 1));
            }
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