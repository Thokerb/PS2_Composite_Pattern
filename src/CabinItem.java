import java.util.ArrayList;
import java.util.List;

public class CabinItem extends CabinElement {
    private double price;

    public CabinItem(String name,double price) {
        super(name);
        this.price = price;
    }

    public CabinItem(String name){
        super(name);
        this.price = 0;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public List<CabinElement> getPremiumCabinElements() {
        var response = new ArrayList<CabinElement>();
        if(price > 0){
            response.add(this);
        }
        return response;
    }

    @Override
    public String toString() {
        return "CabinItem{" +
                "name=" + getName() +
                ",price=" + price +
                '}';
    }
}
