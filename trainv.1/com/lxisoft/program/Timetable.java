package com.lxisoft.program;

public class Timetable
{
	int location;
	public Timetable(int location)
	{
		this.location=location;
	}

	void printTimetable()
	{
		switch(location)
		{
				case 1:
					System.out.println("METRO FROM ALUVA TOWARDS ERNAKULAM:");
					System.out.println("NO\tMETRO NAME\tTIME");
					System.out.println("1.\tMETRO RAIL 1\t9:00am");
					System.out.println("2.\tMETRO RAIL 2\t5:00pm");
					System.out.println("3.\tMETRO RAIL 3\t9:00pm");
					break;
				case 2:
					System.out.println("METRO FROM KALOOR TOWARDS ERNAKULAM:");
					System.out.println("NO\tMETRO NAME\tTIME");
					System.out.println("1.\tMETRO RAIL 1\t9:10am");
					System.out.println("2.\tMETRO RAIL 2\t5:10pm");
					System.out.println("3.\tMETRO RAIL 3\t9:10pm\n");
					System.out.println("METRO FROM KALOOR TOWARDS ALUVA:");
					System.out.println("NO\tMETRO NAME\tTIME");
					System.out.println("1.\tMETRO RAIL 4\t10:20am");
					System.out.println("2.\tMETRO RAIL 5\t6:20pm");
					System.out.println("3.\tMETRO RAIL 6\t10:20pm\n");
					break;
				case 3:
					System.out.println("METRO FROM KADAVANTHRA TOWARDS ERNAKULAM:");
					System.out.println("NO\tMETRO NAME\tTIME");
					System.out.println("1.\tMETRO RAIL 1\t9:20am");
					System.out.println("2.\tMETRO RAIL 2\t5:20pm");
					System.out.println("3.\tMETRO RAIL 3\t9:20pm\n");

					System.out.println("METRO FROM KADAVANTHRA TOWARDS ALUVA:");
					System.out.println("NO\tMETRO NAME\tTIME");
					System.out.println("1.\tMETRO RAIL 4\t10:10am");
					System.out.println("2.\tMETRO RAIL 5\t6:10pm");
					System.out.println("3.\tMETRO RAIL 6\t10:10pm\n");
					break;
				case 4:
					System.out.println("METRO FROM ERNAKULAM TOWARDS ALUVA:");
					System.out.println("NO\tMETRO NAME\tTIME");
					System.out.println("1.\tMETRO RAIL 4\t10:00am");
					System.out.println("2.\tMETRO RAIL 5\t6:00pm");
					System.out.println("3.\tMETRO RAIL 6\t10:00pm\n");
					break;
			default:
				System.out.println("Invalid station name");
		}
	}

}