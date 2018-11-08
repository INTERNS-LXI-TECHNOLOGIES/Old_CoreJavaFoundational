package contact.model;

import java.util.HashSet;

public class ContactNumber
{
    private int id;

    private HashSet<String> numbers;

    public ContactNumber()
    {
        this.numbers = new HashSet<>();
    }

    public void setId(int Id) {

        this.id = Id;
    }

    public int getId() {
        return this.id;

    }
    public boolean setNumber(String Number) {
      
        if(this.numbers.add(Number))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    

    public void setNumbers(String ...Numbers)
    {
        for(int i =0;i < Numbers.length;i++)
        {
            this.getNumbers().add(Numbers[i]);
        }
    }

    // public String getNumber(){}

    public HashSet<String> getNumbers()
    {
        return this.numbers;
    }

    @Override
    public boolean equals(Object e)
    {
        boolean success = false;

        for(String number : ((ContactNumber)e).getNumbers())
        {
            if(this.getNumbers().contains(number))
            {
                success = true;
            }

            
        }

        return success;
    }

    
}