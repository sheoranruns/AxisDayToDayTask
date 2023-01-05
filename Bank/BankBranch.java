package Bank;

import java.util.Scanner;

public class BankBranch extends BankMain {
    String branchname;
    int branchid;
    long branchPhone;
    private int branchTotalFund;
    private float branchIntr;

    public BankBranch(int bankTotalFund, float bankIntr, String branchname, int branchid, long branchPhone,
            int branchTotalFund, float branchIntr, String bankname, int bankid, long bankPhno) {
        super(bankTotalFund, bankIntr);
        super.bankname = bankname;
        super.bankid = bankid;
        super.bankPhone = bankPhone;
        this.branchname = branchname;
        this.branchid = branchid;
        this.branchPhone = branchPhone;
        this.branchTotalFund = branchTotalFund;
        this.branchIntr = branchIntr;
    }

    public static void main(String[] args) {
        BankBranch Axis = new BankBranch(10000000, 4, "Axis", 5672, 995867896, 1000000, 2, "RBI", 98465, 928395765);
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the loan amount");
        int loan = sc.nextInt();
        Axis.checkloan(loan, Axis.branchIntr);
    }
}
