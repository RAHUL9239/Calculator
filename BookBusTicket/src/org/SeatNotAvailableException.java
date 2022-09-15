package org;

public class SeatNotAvailableException extends RuntimeException
{
	private String message;
	
	SeatNotAvailableException(String message)
	{
		this.message=message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
}
