package day2;

public enum Month {
	JAN(31),FEB(28),MARCH(31),APRIL(30),MAY(31),JUNE(30),JULY(31),AUG(31),SEP(30),OCT(31),NOV(30),DEC(31);
	int month;
	private Month(int month) 
	{
		this.month = month;
	}
	
	public int getMonth() 
	{
		return month;
	}

}
