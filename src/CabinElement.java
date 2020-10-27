import java.util.List;

public abstract class CabinElement {
    public String getName() {
        return name;
    }

    private String name;

    public CabinElement(String name) {
        this.name = name;
    }

    public abstract List<CabinElement> getPremiumCabinElements();

    @Override
    public String toString() {
        return "CabinElement{" +
                "name='" + name + '\'' +
                '}';
    }
}
