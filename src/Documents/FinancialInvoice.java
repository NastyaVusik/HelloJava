package Documents;

//import java.util.Date;

import java.time.LocalDate;

public class FinancialInvoice extends BaseDocuments {
    private double totalMonthSum;
    private String departCode;


    //Constructor without parameters
    public FinancialInvoice() {
        super();
        this.totalMonthSum = 0;
        this.departCode = "Unknown";

    }

    public FinancialInvoice(String docType, int docNumber, LocalDate docDate, double totalMonthSum, String departCode) {
        super(docType, docNumber, docDate);
        this.totalMonthSum = totalMonthSum;
        this.departCode = departCode;

    }


    //Getters and Setters

    public double getTotalMonthSum() {
        return totalMonthSum;
    }

    public void setTotalMonthSum(double totalMonthSum) {
        this.totalMonthSum = totalMonthSum;
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode;
    }


    //Overrided method from class BaseDocuments
    public String printInfo() {

        return "Type of document: " + getDocType() + "\n" +
                "1. A number of the document: " + getDocNumber() + "\n" +
                "2. Final month sum: " + getTotalMonthSum() + "\n" +
                "3. Department code: " + getDepartCode() + "\n" +
                "4. A date of the document: " + getDocDate();
    }

}
