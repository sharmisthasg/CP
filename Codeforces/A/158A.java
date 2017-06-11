import java.io.*;
import java.util.*;

public class q22
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int k = Reader.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i] = Reader.nextInt();
        }
        int cutoff = arr[k-1];
        for (int i=0; i<n; i++)
        {
            if (arr[i] >= cutoff && arr[i] > 0)
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