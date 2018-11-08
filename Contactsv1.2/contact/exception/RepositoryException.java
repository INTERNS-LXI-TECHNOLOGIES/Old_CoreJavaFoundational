
/**
 * Class RepositoryException
 *
 *    ->   
 */

package contact.exception;

public class RepositoryException extends Exception
{
    public RepositoryException(String msg)
    {
        super(msg);
        this.printStackTrace();
    }

}