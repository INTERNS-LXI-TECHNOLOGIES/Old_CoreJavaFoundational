
/**
 * Java Class Contact
 * 
 * This Class is a Model Class for Creating Contact Database
 *
 * @author Jishnu
 * 
 * @version 1.00 
 * 
 * @LastUpdated : 
 * 
 */

package contact.model;

public class Contact {

	@Distinct
	private int id;

	private String name;

	private String mobileNo;

	private String landLine;

	private String homeMail;

	private String workMail;

	private String address;

	public Contact() {}

	/**
	 * Get the id of a Contact
	 * 
	 * @return int
	 */
	public int getId() {

		return this.id;
	}
	
	/**
	 * Set Id of a Contact
	 * 
	 * @param id
	 */
	public void setId(int id) {

		this.id = id;
	}

	/**
	 * Get Name of a Contact
	 * 
	 * @return String
	 */
	public String getName() {

		return this.name;
	}

	/**
	 * Set Name of a Contact
	 * 
	 * @param name
	 */
	public void setName(String name) {

		this.name = name;
	}

	/**
	 * Get Mobile Number of a Contact
	 * 
	 * @return String
	 */
	public String getMobileNo() {

		return this.mobileNo;
	}

	/**
	 * Set Mobile Number of a Contact
	 * 
	 * @param mobileNo
	 */
	public void setMobileNo(String mobileNo) {

		this.mobileNo = mobileNo;
	}

	/**
	 * Get LandLine Number of a Contact
	 * 
	 * @return String
	 */
	public String getLandLine() {

		return landLine;
	}
	
	/**
	 * Set LandLine Number of a Contact
	 * 
	 * @param landLine
	 */
	public void setLandLine(String landLine) {

		this.landLine = landLine;
	}

	/**
	 * Get Home Mail of a Contact
	 * 
	 * @return String
	 */
	public String getHomeMail() {

		return homeMail;
	}

	/**
	 * Set Home Email of a Contact
	 * 
	 * @param homeMail
	 */
	public void setHomeMail(String homeMail) {

		this.homeMail = homeMail;
	}

	/**
	 * Get Work Email of a Contact
	 * 
	 * @return String
	 */
	public String getWorkMail() {

		return workMail;
	}

	/**
	 * Set Work Email of a Contact
	 * 
	 * @param workMail
	 */
	public void setWorkMail(String workMail) {

		this.workMail = workMail;
	}

	/**
	 * Get Address of a Contact
	 * 
	 * @return String
	 */
	public String getAddress() {

		return address;
	}

	/**
	 * Set Address of a Contact
	 * 
	 * @param address
	 */
	public void setAddress(String address) {

		this.address = address;
	}

}
