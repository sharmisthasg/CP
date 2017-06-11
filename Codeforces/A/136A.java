import java.io.*;
import java.util.*;

public class q19
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int n = Reader.nextInt();
        Node head = new Node(Reader.nextInt(), 1, null);
        Node ptr = head;
        for (int i = 0; i<n - 1; i++)
        {
            Node next = new Node(Reader.nextInt(), i+2, null);
            ptr.setlink(next);
            ptr = next;
        }
        /*ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.getkey() + " ");
            ptr = ptr.getlink();
        }
        System.out.println();
        ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.getvalue() + " ");
            ptr = ptr.getlink();
        }
        System.out.println();*/
        for (int i = 1; i<=n; i++)
        {
            ptr = head;
            while (ptr.getkey() != i)
            {
                ptr = ptr.getlink();
            }
            System.out.print(ptr.getvalue() + " ");
        }
        System.out.println();
    }
}

class Node
{
    public int key;
    public int value;
    public Node link;

    public Node(int key, int value, Node link)
    {
        this.key = key;
        this.value = value;
        this.link = link;
    }

    public int getkey()
    {
        return key;
    }

    public int getvalue()
    {
        return value;
    }

    public Node getlink()
    {
        return link;
    }

    public void setlink(Node next)
    {
        link = next;
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