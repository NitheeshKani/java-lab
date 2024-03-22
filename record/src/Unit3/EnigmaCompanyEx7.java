package Unit3;

class Registration {
    private String name;
    private Long[] phone;
    private int voterId;
    private String pancardNo;
    private String passportNo;
    private String LicenseNo;

    Registration(String name, Long[] phone, String pancardNo, String LicenseNo) {
        this.name = name;
        this.phone = phone;

        this.pancardNo = pancardNo;
        this.LicenseNo = LicenseNo;
    }

    Registration(String name, Long[] phone, String passportNo) {
        this.name = name;
        this.phone = phone;

        this.passportNo = passportNo;
    }

    Registration(String name, Long[] phone, int voterId, String LicenseNo) {
        this.name = name;
        this.phone = phone;

        this.voterId = voterId;
        this.LicenseNo = LicenseNo;
    }

    Registration(String name, Long[] phone, String pancardNo, int voterId) {
        this.name = name;
        this.phone = phone;

        this.voterId = voterId;
        this.pancardNo = pancardNo;
    }

    String getName() {
        return name;
    }

    public String getLicenseNo() {
        return LicenseNo;
    }

    public String getPancardNo() {
        return pancardNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public Long[] getPhone() {
        return phone;
    }
    public int getVoterId() {
        return voterId;
    }

}

public class EnigmaCompanyEx7 {
    public static void main(String[] args) {

        Registration r1 = new Registration("Nitheesh", new Long[] { 1234567890L, 1234576890L }, 1234567890,
                "1234TN7890");
                System.out.println("Name:"+r1.getName()+"\n"+"LicenseNo:"+r1.getLicenseNo()+"\n"+"PancardNo:"+r1.getPancardNo()+"\n"+"VoterId:"+r1.getVoterId()+"\n"+"Phone:"+r1.getPhone()[0]+"\n"+"Phone:"+r1.getPhone()[1]);

    }
}
