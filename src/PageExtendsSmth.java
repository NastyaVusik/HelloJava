import java.util.List;

public class PageExtendsSmth<T extends Number> {


    private List<? extends T> items;

    public List<? extends T> getItems(){
        return items;
    }

    public List<? extends T> setItems(List<? extends T> items){
        this.items = items;
    }

    PageExtendsSmth<Double> doublePageExtendsSmth = new PageExtendsSmth<>();
    List<Double> a = doublePageExtendsSmth.setItems(List<Double>);


}
