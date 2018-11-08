
package contact.model;

import java.util.HashSet;
import java.util.Set;

public class ContactEmail
{
    private Set<String> emails;

    public ContactEmail()
    {
        this.emails = new HashSet<>();
    }

    public void add(String email)
    {
        this.emails.add(email);
    }

    public void remove(String email)
    {
        this.emails.remove(email);
    }

    public Set<String> get()
    {
        return this.emails;
    }

    @Override
    public String toString()
    {
        String str = new String();

        for(String email : this.emails)
        {
            str = str.concat(email );
        }

        return str;
    }
}