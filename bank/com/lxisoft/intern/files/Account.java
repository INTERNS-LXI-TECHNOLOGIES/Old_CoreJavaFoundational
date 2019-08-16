import com.lxisoft.intern.files.Account;
import java.util.*;
public class Account
{
	static int lastProvidedAccNo=1000;
	    int accno;
        static Scanner in = new Scanner(System.in);
	public void readAccount()
	    {    
           
            //accno=in.nextInt();
            accno=lastProvidedAccNo++;
            System.out.println("Account number:"+accno);

        }

}