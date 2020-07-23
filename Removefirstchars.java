package com.epam.TDD_JUNIT;

public class Removefirstchars 
{

	public String removing(String string)
	{
		// TODO Auto-generated method stub
		String sb=new String();
		sb="";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='A' && (i==0 || i==1))
			{
				continue;
				
			}
			else
			{
				sb+=(string.charAt(i));
			}
		}
		return sb;
	}

}
