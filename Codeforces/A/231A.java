import java.io.*;
import java.util.*;

public class q25
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            int x = Reader.nextInt();
            int y = Reader.nextInt();
            int z = Reader.nextInt();
            if (x==1 && y==1 || y==1 && z==1 || x==1 && z==1 || x==1 && y==1 && z==1)
            {
                count++;
            }
        }
        System.out.println(count);
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