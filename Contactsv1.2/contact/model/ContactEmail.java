package contact.model;

import java.util.HashSet;

public class ContactEmail
{
    private int id;

    private HashSet<String> emails;

    public ContactEmail()
    {
        this.emails = new HashSet<>();
    }

    public void setId(int Id) {

        this.id = Id;
    }

    public int getId() {
        return this.id;

    }
    public boolean setEmail(String Email) {
      
        if(this.emails.add(Email))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setEmails(String ...Emails)
    {
        for(int i =0;i < Emails.length;i++)
        {
            this.getEmails().add(Emails[i]);
        }
    }

  

   public HashSet<String> getEmails()
   {
       return this.emails;
   }

    @Override
    public boolean equals(Object e)
    {
        boolean success = false;

        for(String email : ((ContactEmail)e).getEmails())
        {
            if(this.getEmails().contains(email))
            {
                success = true;
            }

            
        }

        return success;
    }

    
}