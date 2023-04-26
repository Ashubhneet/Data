package Assignment2;

public class BANK
{
    private String Name,headOfficeAddress,chairmanName;
    private int branchCount;
    private double fdInterstRate,personalLoanInterestRate,homeLoanInterestRate;
    public  BANK (String Name, String headOfficeAddress, String chairmanName, int branchCount, double fdInterstRate,
                  double personalLoanInterestRate , double homeLoanInterestRate)
    {
        this.Name = Name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterstRate = fdInterstRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public String getHeadOfficeAddress()
    {
        return headOfficeAddress;
    }
    public void setHeadOfficeAddress(String headOfficeAddress)
    {
        this.headOfficeAddress = headOfficeAddress;
    }
    public String getChairmanName()
    {
        return chairmanName;
    }
    public void setChairmanName(String chairmanName)
    {
        this.chairmanName = chairmanName;
    }
    public int getBranchCount()
    {
        return branchCount;
    }
    public void setBranchCount(int branchCount)
    {
        this.branchCount = branchCount;
    }
    public double getfdInterstRate()
    {
        return fdInterstRate;
    }
    public void setfdInterstRate(double fdInterstRate)
    {
        this.fdInterstRate = fdInterstRate;
    }
    public double getpersonalLoanInterestRate()
    {
        return personalLoanInterestRate;
    }
    public void setpersonalLoanIntrestRate (double personalLoanInterestRate)
    {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }
    public double gethomeLoanInterestRate()
    {
        return homeLoanInterestRate;
    }
    public void sethomeLoanInterestRate(double homeLoanInterestRate)
    {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    @Override
    public String toString()
    {
        return
                "name = " + Name + '\n' +
                        "headOfficeAddress = " + headOfficeAddress + '\n' +
                        "chairmanName = " + chairmanName + '\n' +
                        "branchCount = " + branchCount + '\n' +
                        "fdInterstRate = " + fdInterstRate + '\n' +
                        "personalLoanInterestRate = " + personalLoanInterestRate + '\n' +
                        "homeLoanInterestRate = " + homeLoanInterestRate + '\n';
    }
    public static void main(String[] args)
    {
        ICICI icici = new ICICI("ICICI Bank", "Delhi", "harshit aggarwal", 5000,5.5, 11.5, 7.5);

        SBI sbi = new SBI("SBI bank","Delhi","harsh",9000,7.5,6.5, 8.8);

        System.out.println(icici.toString());
        System.out.println(sbi.toString());

        icici.setfdInterstRate(6.0);
        icici.setpersonalLoanIntrestRate(12.0);
        icici.sethomeLoanInterestRate(8.0);

        sbi.setfdInterstRate(5.0);
        sbi.setpersonalLoanIntrestRate(4.0);
        sbi.sethomeLoanInterestRate(6.6);

        System.out.println(icici.toString());
        System.out.println(sbi.toString());
    }
}
