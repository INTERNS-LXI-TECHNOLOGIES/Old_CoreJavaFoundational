
package contact.model;

import java.util.HashSet;
import java.util.Set;

public class Contact
{
    private String name;
    private Set<String> phone_numbers;
    private Set<String> emails;

    public Contact()
    {
        this.phone_numbers = new HashSet<>();
        this.emails = new HashSet<>();
    }

    public void setName(String Name)
    {
        this.name = Name;
    }

    public int setNumber(String Number)
    {
        if(this.phone_numbers.contains(Number))
        {
            return -1;
        }

        this.phone_numbers.add(Number);

        return 1;
    }

    public int setEmail(String Email)
    {
        if(this.emails.contains(Email))
        {
            return -1;
        }

        this.emails.add(Email);

        return 1;
    }

    public String getName()
    {
        return this.name;
    }

    public Set<String> getNumbers()
    {
        return this.phone_numbers;
    }

    public Set<String> getEmails()
    {
        return this.emails;
    }

    

}