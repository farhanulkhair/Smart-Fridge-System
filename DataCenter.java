// Komponen sinkronisasi data, membutuhkan viewer
public class DataCenter implements SyncService {
    private IngredientViewer viewer;

    public DataCenter(IngredientViewer viewer) {
        this.viewer = viewer;
    }

    @Override
    public void syncItems() {
        System.out.println("Sinkronisasi bahan dari FridgeUnit...");
        viewer.showAllItems();
    }
}