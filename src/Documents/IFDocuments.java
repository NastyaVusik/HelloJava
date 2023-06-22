package Documents;

//import java.util.Date;

import java.time.LocalDate;

public interface IFDocuments {

    //Getters and Setters
    public int getDocNumber();

    public void setDocNumber(int number);

    //    public Date getDocDate();
    public LocalDate getDocDate();


    //    public void setDocDate(Date date);
    public void setDocDate(LocalDate date);


    //Method for output info
    public String printInfo();

}
