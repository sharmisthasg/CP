import java.io.*;
import java.util.*;

public class q8
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 1; i<=n*3; i++)
        {
            if (i%3 == 0)
                sum1 = sum1 + Reader.nextInt();
            else if (i%3 == 1)
                sum2 = sum2 + Reader.nextInt();
            else
                sum3 = sum3 + Reader.nextInt();
        }
        if (sum1 == 0 && sum2 == 0 && sum3 == 0)
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