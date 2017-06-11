import java.io.*;
import java.util.*;

public class q11
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        double x = Reader.nextDouble();
        String s = Double.toString(x);
        int count = 0;
        for (int i = 0; i<s.length(); i++)
        {
            if (s.charAt(i) == '4' || s.charAt(i) == '7')
                count++;
        }
        //System.out.println(count);
        if (count == 4 || count == 7)
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