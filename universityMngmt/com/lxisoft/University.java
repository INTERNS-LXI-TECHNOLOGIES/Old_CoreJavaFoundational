public class University
{
	String clg,psd,username,c_mail,Id,c_address;
	private ArrayList<College> college=new ArrayList<College>
	public void CollegeReg()
	{	Scanner input=new Scanner (System.in);
		System.out.println("Registration Form");

		System.out.println(" Enter the college Details:");
		System.out.println("College Name:");clg=input.nextLine();
		System.out.println("College ID:");	Id=input.nextLine();
		System.out.println("User Name:");	username=input.nextLine();
		System.out.println("Password:");	psd=input.nextLine();
		System.out.println("E_MAIL:\n");	c_mail=input.nextLine();
		System.out.println("ADDRESS:");		c_address=input.nextLine();
		System.out.println("Registration completed successfully.\n Press any other number to Home page; \n Press 1 to Login; ");
		int c_key=input.nextInt();
		/*switch(c_key)
		{
			case 1:Login();
			break;
			default:universityHome();
		}*/
	college.add(new College(clg,Id,username,psd,c_mail,c_address));
	/*college.add(new college(id));
	college.add(new college(username));
	college.add(new college(psd));
	college.add(new college(c_mail));
	college.add(new college(c_address));*/
	
		
	}
	
	
	
	
	
	public ArrayList<College> getCollege() {
		return college;
	}
	public void setCollege(ArrayList<College> college) {
		this.college = college;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void universityHome()
	{
	System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tDate:\n\t\t\t\t\t\t\t\t\t\t\tTime:\n");
	System.out.println("\n<1.REGISTARTION>\t\t<2.EXAMINATION RESULTS>\t\t<3.SYLLUBUS>\t\t<4.NOTIFICATIONS>\n<5.TIMETABLE>\t\t<6.AFFILIATED COLLEGES>\t\t<7.About us>\t\t<8.Contact us>\t\t<9.COURSES >");
		Scanner input=new Scanner(System.in);
		int selectInput=input.nextInt();
		switch(selectInput)
		{
		case 1:CollegeReg();
				break;
		/*case 2:ExaminationResult();
				break;
		case 3:Syllubus();
				break;
		case 4:Notification();
				break;
		case 5:Timetable();
				break;
		case 6:College_List();
				break;
		case 7:About_us();
				break;
		case 8:Contact_us();
				break;
		case 9:Courses();
				break;
		default:System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<Thank You>>>>>>>>>>>>>>>>>>>>>>>>>>");*/
		}
	}
}