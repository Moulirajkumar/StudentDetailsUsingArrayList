package programsOnArrayList;

public class Student_Details_Using_ArrayList 
{
	private  String name;
	private int id;
	private String mail_id;
	private long phone_no;
	private String studies;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the mail_id
	 */
	public String getMail_id() {
		return mail_id;
	}

	/**
	 * @param mail_id the mail_id to set
	 */
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	/**
	 * @return the phone_no
	 */
	public long getPhone_no() {
		return phone_no;
	}

	/**
	 * @param phone_no the phone_no to set
	 */
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	/**
	 * @return the studies
	 */
	public String getStudies() {
		return studies;
	}

	/**
	 * @param studies the studies to set
	 */
	public void setStudies(String studies) {
		this.studies = studies;
	}

	public Student_Details_Using_ArrayList(int id,String name,String mail_id,long phone_no,String studies)
	{
		this.id=id;
		this.mail_id=mail_id;
		this.name=name;
		this.phone_no=phone_no;
		this.studies=studies;
	}
	
}
