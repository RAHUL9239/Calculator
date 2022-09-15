package org;

 class BusBookingPortalImpl implements BusBookingPortal
 {
	 int availableTicket;
	 
	 BusBookingPortalImpl( int availableTicket)
	 {
		 this.availableTicket=availableTicket;
	 }

	@Override
	public void bookTicket(int bookticket) 
	{
		if(availableTicket>bookticket)
		{
		availableTicket=availableTicket-bookticket;		
		 System.out.println("Succesfully Booked Ticket:- "+bookticket);
		}
		else
		{
			try{
				throw new SeatNotAvailableException("Seat Not Available");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public void cancelTicket(int cancelticket)
	{

		availableTicket=availableTicket+cancelticket;
		System.out.println("Succesfully Cancel Ticket:- "+availableTicket);
		
		
	}

	@Override
	public void availableTicket(){
		System.out.println("Available tickets are"+availableTicket);

		
	}
	 

}
