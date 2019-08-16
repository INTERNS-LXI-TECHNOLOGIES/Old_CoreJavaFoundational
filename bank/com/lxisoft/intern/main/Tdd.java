import com.lxisoft.intern.main.Tdd;
package com.lxisoft.intern.files.Bank;
package com.lxisoft.intern.files.Manager;
package com.lxisoft.intern.files.Acoount;
package com.lxisoft.intern.files.Customer;
public class Tdd
{
  public static void main(String[] arg)
   {
	Bank b = new Bank("CANARA BANK","PALAKKAD");
    b.createManager();
    b.createCustomers();
    b.displayCustomers();
   }

}   
