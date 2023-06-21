//package Documents;
//
//import java.util.Date;
//
//public class EmployeeContract extends BaseDocuments {
//
//    private String contractExpireDate;
//    private String employeeName;
//
//
//    //Constructor without parameters
//    public EmployeeContract() {
//        super();
//        this.contractExpireDate = "Unknown";
//        this.employeeName = "Unknown";
//    }
//
//    //Constructor without parameters
//    public EmployeeContract(String docType, int docNumber, Date docDate, String contractExpireDate, String employeeName) {
//        super(docType, docNumber, docDate);
//        this.contractExpireDate = contractExpireDate;
//        this.employeeName = employeeName;
//    }
//
//
//    //Getters and Setters
//
//    public String getContractExpireDate() {
//        return contractExpireDate;
//    }
//
//
//    public void setContractExpireDate(String contractExpireDate) {
//        this.contractExpireDate = contractExpireDate;
//    }
//
//
//    public String getEmployeeName() {
//        return employeeName;
//    }
//
//
//    public void setEmployeeName(String employeeName) {
//        this.employeeName = employeeName;
//    }
//
//
//    //Overrided method from class BaseDocuments
//    @Override
//    public String printInfo() {
//
//        return "Type of document: " + getDocType() + "\n" +
//                "1. A number of the document: " + getDocNumber() + "\n" +
//                "2. A contract expire date of the employee: " + getContractExpireDate() + "\n" +
//                "3. A name of the employee: " + getEmployeeName() + "\n" +
//                "4. A date of the document: " + getDocDate() + "\n" +
//                "**********************************************************\n";
//    }
//}
