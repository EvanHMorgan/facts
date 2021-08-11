package Application;

import java.util.Map;

public interface Stockable {
    public void restock();
    public Map<String, String> getInventory();
    public String printInventory();
}
