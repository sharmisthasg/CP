import java.io.*;
import java.util.*;

public class q7
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        String a = Reader.next();
        String b = Reader.next();
        for (int i = 0; i<a.length(); i++)
        {
            if (a.charAt(i) == b.charAt(i))
                System.out.print("0");
            else
                System.out.print("1");
        }
        System.out.println();
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

