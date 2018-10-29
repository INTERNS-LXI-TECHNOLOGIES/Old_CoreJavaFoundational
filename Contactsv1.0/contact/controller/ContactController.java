
package contact.controller;

import java.util.LinkedList;

public class ContactController<T>
{
    private LinkedList<T> contacts;

    public ContactController()
    {
        this.contacts = new LinkedList<>();
    }

    public LinkedList<T> getContacts()
    {
        return this.contacts;
    }

    public int add(T contact)
    {
        if(this.contacts.contains(contact))
        {
            return -1;
        }

        this.contacts.add(contact);
        
        return 1;
    }

    public void remove(T contact)
    {
        this.contacts.remove(contact);
    }

}