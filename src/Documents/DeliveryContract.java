package Documents;

import java.util.Date;

public class DeliveryContract extends BaseDocuments {

    private String goodsType;
    private int goodsQuantity;


    //Constructor without parameters
    public DeliveryContract() {
        super();
        this.goodsType = "Unknown";
        this.goodsQuantity = 0;

    }


    //Constructor with parameters
    public DeliveryContract(String docType, int docNumber, Date docDate, String goodsType, int goodsQuantity) {
        super(docType, docNumber, docDate);

        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }


    //Getters and Setters

    public String getGoodsType() {
        return goodsType;
    }

    public int getGoodsQuantity() {
        return goodsQuantity;
    }


    //Overrided method from class BaseDocuments
    @Override
    public String printInfo() {

        return "Type of document: " + getDocType() + "\n" +
                "1. A number of the document: " + getDocNumber() + "\n" +
                "2. Goods type: " + getGoodsType() + "\n" +
                "3. Quantity of goods: " + getGoodsQuantity() + "\n" +
                "4. A date of the document: " + getDocDate() + "\n" +
                "**********************************************************\n";
    }

}
