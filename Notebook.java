import java.util.HashMap;
import java.util.Map;

public class Notebook {
    private String brand;
    private int RAM;
    private int SSD;
    private String OS;
    private String graphicCard;
    private int price;

    public Notebook(String brand,int RAM,int SSD,String OS,String graphicCard,int price){
        this.brand = brand;
        this.RAM = RAM;
        this.SSD = SSD;
        this.OS = OS;
        this.graphicCard=graphicCard;
        this.price = price;
    }
    public Map<String,String> mainFeature(){
        Map<String, String> map = new HashMap<>();
        map.put("Brand", brand);
        map.put("RAM", String.valueOf(RAM));
        map.put("SSD", String.valueOf(SSD));
        map.put("OS", OS);
        map.put("Graphic Card", graphicCard);
        map.put("price", String.valueOf(price));
        return map;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, RAM: %d GB, SSD: %d GB, OS: %s, Graphic Card: %s, Price: %d $",
                brand, RAM, SSD, OS, graphicCard, price);
    }
}