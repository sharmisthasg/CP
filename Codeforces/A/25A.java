import java.io.*;
import java.util.*;

public class q3
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int N = Reader.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = Reader.nextInt();
        }
        for (int i = 0; i < N-1; i++)
        {
            if (arr[i]%2 != arr[i+1]%2)
            {
                System.out.println(i+2);
                break;
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