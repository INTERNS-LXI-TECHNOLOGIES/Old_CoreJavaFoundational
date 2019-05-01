import java.util.*;
public class Actor 
{
private String characterName;
private String roleName;
private String role;

Scanner scan=new Scanner(System.in);

public void setCharacterName(String characterName)
{
this.characterName=characterName;
}
public String getCharacterName()
{
return characterName;
}

public void setRoleName(String roleName)
{
this.roleName=roleName;
}
public String getRoleName()
{
return roleName;
}

public void setRole(String role)
{
this.role=role;
}
public String getRole()
{
return role;
}




}