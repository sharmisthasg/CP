import java.io.*;
import java.util.*;

public class q2
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int x = Reader.nextInt();
        if (x == 1 || x == 2)
            System.out.println("NO");
        else if (x % 2 != 0)
            System.out.println("NO");
        else if (x % 2 == 0)
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