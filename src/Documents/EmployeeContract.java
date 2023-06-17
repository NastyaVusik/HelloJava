package Documents;

import java.util.Date;

public class EmployeeContract extends BaseDocuments {

    private String contractExpireDate;
    private String employeeName;


    //Constructor without parameters
    public EmployeeContract() {
        super();
        this.contractExpireDate = "Unknown";
        this.employeeName = "Unknown";
    }

    //Constructor without parameters
    public EmployeeContract(String docType, int docNumber, Date docDate, String contractExpireDate, String employeeName) {
        super(docType, docNumber, docDate);
        this.contractExpireDate = contractExpireDate;
        this.employeeName = employeeName;
    }

}
