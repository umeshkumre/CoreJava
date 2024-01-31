package packageOne;

import java.util.Arrays;

public class Test1 {
 public static String sorts(String str)
 {
	 char ar[]=str.toCharArray();
	 Arrays.sort(ar);
	 
	 
	 return String.valueOf(ar);
 }
	
	
	public static void main(String[] args) {
		String str1="heart";
		String str2="earth";
		
		System.out.println(str1+"   "+str2);
		
		str1=sorts(str1);
		str2=sorts(str2);
		if(str1.equals(str2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("Not");
		}

	}

}
