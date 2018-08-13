package com.lxisoft.wayout.model;

/**
* This UserModel class is used to set and get the variables.
*@author Deepthi E
*@author Balagopal V
*/
public class UserModel
{
/**
* The variable userName is used to hold a String value userName.
* The variable password is used to hold a String value password.
*/
private String userName,password;

/**
*Set the value of userName.
*@param userName variable used to pass the value of userName.
*/
public void setUsername(String userName)
{
this.userName=userName;
}
/**
*Retrieve the value of userName.
*@return userName variable used to return the String value userName.
*/
public String getUsername()
{
return userName;
}
/**
*Set the value of password.
*@param password variable used to pass the value of password.
*/
public void setPassword(String password)
{
this.password=password;
}
/**
*Retrieve the value of password.
*@return password variable used to return the String value password.
*/
public String getPassword()
{
return password;
}
}