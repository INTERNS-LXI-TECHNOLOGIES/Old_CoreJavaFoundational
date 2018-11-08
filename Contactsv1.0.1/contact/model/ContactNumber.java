
package contact.model;

import java.util.HashSet;
import java.util.Set;

public class ContactNumber
{
    private Set<String> numbers;

    public ContactNumber()
    {
        this.numbers = new HashSet<>();
    }

    public void add(String no)
    {
        this.numbers.add(no);
    }

    public void remove(String no)
    {
        this.numbers.remove(no);
    }

    public Set<String> get()
    {
        return this.numbers;
    }

    @Override
    public String toString()
    {
        String str = new String();

        for(String num : this.numbers)
        {
            str = str.concat(num );
        }

        return str;
    }
}