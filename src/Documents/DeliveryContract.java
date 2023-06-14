package Documents;

public class DeliveryContract extends Register {

    //    private String docType;
//    private int docNumber;
    private String goodsType;
    private int goodsQuantity;
//    private Date docDate;

    //Constructor without parameters
    public DeliveryContract() {
        super();
        this.goodsType = "Unknown";
        this.goodsQuantity = 0;

    }


    //Constructor with parameters
//    public DeliveryContract(String docType, int docNumber, String goodsType, int goodsQuantity, Date docDate) {
//        this.docType = docType;
//        this.docNumber = docNumber;
//        this.goodsType = goodsType;
//        this.goodsQuantity = goodsQuantity;
//        this.docDate = docDate;
//    }

    public DeliveryContract(String docType, int docNumber, Date docDate, String goodsType, int goodsQuantity) {
        super(docType, docNumber, docDate);

        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }


    //Getters
    public String getDocType() {
        return docType;
    }

    public int getDocNumber() {
        return docNumber;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public int getGoodsQuantity() {
        return goodsQuantity;
    }

    public Date getDocDate() {
        return docDate;
    }

    @Override
    public String giveDocInfo() {
        return "Type of document: " + getDocType() + "\n" +
                "1. A number of the document: " + getDocNumber() + "\n" +
                "2. Goods type: " + getGoodsType() + "\n" +
                "3. Quantity of goods: " + getGoodsQuantity() + "\n" +
                "4. A date of the document: " + getDocDate();
    }

}
