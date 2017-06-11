import java.io.*;
import java.util.*;

public class q21
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int k = Reader.nextInt();
        int l = Reader.nextInt();
        int m = Reader.nextInt();
        int n = Reader.nextInt();
        int d = Reader.nextInt();
        if (k == 1 || l == 1 || m == 1 || n == 1)
            System.out.println(d);
        else
        {
            int count = 0;
            for (int i = 1; i<=d; i++)
            {
                if (i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0 )
                {
                    count++;
                }
            }
            System.out.println(count);
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