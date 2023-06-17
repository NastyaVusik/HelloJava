package Documents;

import java.util.Date;

public interface IFDocuments {

    //Getters and Setters
    public int getDocNumber();

    public void setDocNumber(int number);

    public Date getDocDate();

    public void setDocDate(Date date);


    //Method for output info
    public String printInfo();


}
