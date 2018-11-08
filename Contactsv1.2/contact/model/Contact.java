package contact.model;

public class Contact
{
    private int id;

    private String name;

    private ContactNumber numbers = new ContactNumber();

    private ContactEmail emails = new ContactEmail();

    public Contact(int Id , String Name)
    {
        this.id = Id;
        this.name = Name;
    }

    public Contact(int Id , String Name , ContactNumber Numbers)
    {
        this.id = Id;
        this.name = Name;
        this.numbers = Numbers;
    }
    
    public Contact(int Id , String Name , ContactNumber Numbers , ContactEmail Emails)
    {
        this.id = Id;
        this.name = Name;
        this.numbers = Numbers;
        this.emails = Emails;
    }

    public int getId() { 
        
        return this.id; 
    }
    
    public void setId(int Id) { 
        
        this.id = Id; 
    }

    public String getName() { 
        
        return this.name; 
    }
    
    public void setName(String Name) { 
        
        this.name = Name; 
    }

    public ContactNumber getNumbers() { 
        
        return this.numbers; 
    }

    public void setNumbers(ContactNumber Numbers) { 
        
        this.numbers = Numbers; 
    }

    public ContactEmail getEmails() { 
        
        return this.emails; 
    }

    public void setEmails(ContactEmail Emails) { 
        
        this.emails = Emails;
    }

    public boolean setNumber(String Number) {

        if(this.getNumbers().setNumber(Number))
        {
            return true;
        }

        return false;
    }
   
    
    public boolean setEmail(String Email) {

        if(this.getEmails().setEmail(Email))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   

    // getNumber(){}
    // getEmail(){}

   @Override
   public boolean equals(Object obj)
   {
       boolean success = false;

       if(this.getId() == ((Contact)obj).getId())
       {
           success = true;
       }

       if(this.getName().equals(((Contact)obj).getName()))
       {
            success = true;
       }
       else if(this.getEmails().equals(((Contact)obj).getEmails()))
       {
           success = true;
       }
       else if(this.getNumbers().equals(((Contact)obj).getNumbers()))
       {
           success = true;
       }

       return success;
   }

}