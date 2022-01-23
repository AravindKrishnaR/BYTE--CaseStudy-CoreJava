public class Donor extends Person {
	private String bloodBankName;
	private String donorType;
	private String donationDate;

	Donor(String bloodBankName, String donorType, String donationDate, String name, String dateOfBirth, String gender,
			String mobileNumber, String bloodGroup) {
		super(name, dateOfBirth, gender, mobileNumber, bloodGroup);
		this.bloodBankName = bloodBankName;
		this.donorType = donorType;
		this.donationDate = donationDate;
	}

	public String getBloodBankName() {
		return bloodBankName;
	}

	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}

	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public String getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}

	public void displayDonationDetails() {
		System.out.println("Donation Details : " + "\nName : " + this.getName() + "\nDate Of Birth : "
				+ this.getDateOfBirth() + "\nGender : " + this.getGender() + "Mobile Number : " + this.getMobileNumber()
				+ "Blood Group : " + this.getBloodGroup() + "Blood Bank Name : " + this.getBloodBankName()
				+ "Donor Type : " + this.getDonorType() + "Donation Date : " + this.getDonationDate());
	}
}
