import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main hw = new Main();
        List<Notebook> notebooks = hw.filter(hw.createNotebook(), hw.initListNotebooks());
        System.out.println(notebooks);


    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Acer", 4, 128, "Windows 10 Pro", "Intel 630", 700));
        notebooks.add(new Notebook("HP", 16, 512, "Linux (AstraLinux 8.5)", "Intel 730", 840));
        notebooks.add(new Notebook("Apple", 32, 512, "MacOS X", "ARM A10", 2900));
        return notebooks;
    }

    public Map<String, String> createNotebook() {
        Map<String, String> searchInfo = new HashMap<>();
        searchInfo.put("RAM", "16");
        searchInfo.put("SSD", "512");
        searchInfo.put("OS", "Linux (AstraLinux 8.5)");
        searchInfo.put("Graphic Card", "Intel 730");
        return searchInfo;
    }
    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        List<Notebook> filter = new ArrayList<>();
        for (Notebook notebook: notebooks){
            Map<String,String> notebookFeatures =notebook.mainFeature();
            boolean flag = true;
            for (String features :params.keySet()){
                if (notebookFeatures.containsKey(features)) {
                    if (!params.get(features).equals(notebookFeatures.get(features))) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                filter.add(notebook);
            }
        }
        return filter;
    }
}
