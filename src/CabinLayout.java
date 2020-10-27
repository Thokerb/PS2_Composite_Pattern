import java.util.ArrayList;
import java.util.List;

public class CabinLayout extends CabinElement {
    private List<CabinElement> children;

    public CabinLayout(String name) {
        super(name);
        this.children = new ArrayList<>();
    }


    public void add(CabinElement element){
        children.add(element);
    }

    public void remove(CabinElement element){
        children.remove(element);
    }

    @Override
    public List<CabinElement> getPremiumCabinElements() {
        var response = new ArrayList<CabinElement>();
        for (var child: children) {
            response.addAll(child.getPremiumCabinElements());
        }
        return response;
    }
}
