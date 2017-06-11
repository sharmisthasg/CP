import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class q27
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int[][] matrix = new int[5][5];
        int count = 0;
        int x = 0;
        int y = 0;
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                matrix[i][j] = Reader.nextInt();
                if (matrix [i][j] == '1')
                {
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(x);
        System.out.println(y);
        int temp1 = Math.abs(x - 2);
        int temp2 = Math.abs(y - 2);
        count = temp1 + temp2;
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