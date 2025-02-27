package com.supermarketinfo.Entity;

public class DuplicateExceptionClass extends Exception
{	
	
	private static final long serialVersionUID = 1L;
	public DuplicateExceptionClass(){}
	public DuplicateExceptionClass(String msg)
	{
		super(msg);
	}
}
