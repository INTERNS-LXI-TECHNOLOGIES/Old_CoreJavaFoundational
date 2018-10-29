
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

    public void setNumber(String Number)
    {
        this.phone_numbers.add(Number);
    }

    public void setEmail(String Email)
    {
        this.emails.add(Email);
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