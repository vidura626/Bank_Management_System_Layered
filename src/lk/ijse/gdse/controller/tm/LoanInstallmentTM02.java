package lk.ijse.gdse.controller.tm;

public class LoanInstallmentTM02 {
    String loan;
    double installmentAmount;

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan;
    }

    public double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public LoanInstallmentTM02(String loan, double installmentAmount) {
        this.loan = loan;
        this.installmentAmount = installmentAmount;
    }

    public LoanInstallmentTM02() {
    }
}
