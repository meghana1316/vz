
import java.util.*;
public class STDemo
{
	public static void main(String[] args)
	{
		StringTokenizer st=new StringTokenizer("Smile, the world smiles with you");
		int count=st.countTokens();
		System.out.println("No.of Tokens:"+count);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
