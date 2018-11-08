
package contact.model;

public class Contact
{
    private String name;
    private ContactNumber numbers;
    private ContactEmail emails;

    public Contact()
    {
        this.numbers = new ContactNumber();
        this.emails = new ContactEmail();
    }

    public void setName(String Name)
    {
        this.name = Name;
    }

    public void setNumber(String Number)
    {
        this.numbers.add(Number);
    }

    public void setEmail(String Email)
    {
        this.emails.add(Email);
    }

    public String getName()
    {
        return this.name;
    }

    public ContactNumber getNumbers()
    {
        return this.numbers;
    }

    public ContactEmail getEmails()
    {
        return this.emails;
    }

    @Override
    public boolean equals(Object o)
    {
      
            if(this.getName().equals(((Contact)o).getName()))
            {
                return true;
            }

            for(String number : this.numbers.get())
            {
                if(((Contact)o).numbers.get().contains(number))
                {
                    return true;
                }
            }

            for(String email : this.emails.get())
            {
                if(((Contact)o).emails.get().contains(email))
                {
                    return true;
                }
            }
            return false;

    }


 

}