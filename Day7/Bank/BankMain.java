package Bank;

public class BankMain extends InternationalBank {
    String bankname;
    int bankid;
    long bankPhone;
    private int bankTotalFund;
    private float bankIntr;

    public BankMain(int bankTotalFund, float bankIntr) {
        this.bankTotalFund = bankTotalFund;
        this.bankIntr = bankIntr;
    }

    public void checkloan(int loanamount, float branchIntr) {
        if(loanamount<bankTotalFund) {
            System.out.println("loan can be approve");
            totalIntr(branchIntr);
        }
    }

    void totalIntr(float branchIntr) { 
        System.err.println("Your total Interest will be: " + (branchIntr+this.bankIntr+this.interest()));
    }


}
