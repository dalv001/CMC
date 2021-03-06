/**
 * 
 */
package Admin;

import java.util.ArrayList;

import Account.Account;
import university.University;
import user.User;

/**
 * This is the class for an Admin
 * 
 * @author npink001
 */
public class Admin extends Account
{

	ArrayList manageUniversities = new ArrayList<University>();

	ArrayList manageUsers = new ArrayList();
	
	private String pass;
	private String username; 
	private boolean userBoolean;
	private boolean adminBoolean; 
	
	/**
	 * This is the constructor for an Admin
	 * 
	 * @param password
	 * @param username
	 * @param userBoolean
	 * @param adminBoolean
	 */
	public Admin(String password, String username, boolean userBoolean, boolean adminBoolean) 
	{
	super();
	this.setPass(password);
	this.setUsername(username);
	this.setUserBoolean(userBoolean);
	this.setAdminBoolean(adminBoolean);
	
	}
	
	/**
	 * This method calls on the DB Controller to add a University
	 * 
	 * @param University
	 */
	public void addSchool(University university) 
	{
		//TODO
	}
	
	/**
	 * This method calls on the DB Controller to remove a University
	 * 
	 * @param University
	 */
	public void removeSchool(University university) 
	{
		//TODO
	}
	
	/**
	 * This method is used to set a User Account to inactive
	 * 
	 * @param User
	 */
	public void deactivateUser(User userName) 
	{
		//TODO
	}
	
	/**
	 * This method checks if the Admin is logged in. If so, it returns true
	 * 
	 * @param Admin
	 */
	public boolean isLoggedOn(Admin adminUser)
	{
		return true;
		
	}

	/**
	 * This method gets the password
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * This method changes the password 
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * This method gets the username to set 
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method sets the username 
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method verifies the user
	 * @return the userBolean
	 */
	public boolean isUserBoolean() {
		return userBoolean;
	}

	/**
	 * This method sets the userBoolean 
	 * @param userBolean the userBolean to set
	 */
	public void setUserBoolean(boolean userBoolean) {
		this.userBoolean = userBoolean;
		
	}

	/**
	 * This user check the admin’s boolean status
	 * @return the adminBoolean
	 */
	public boolean isAdminBoolean() {
		return adminBoolean;
	}

	/**
	 * This method sets the admin’s boolean status  
	 * @param adminBoolean the adminBoolean to set
	 */
	public void setAdminBoolean(boolean adminBoolean) {
		this.adminBoolean = adminBoolean;
		
	}
	
	
	
}
