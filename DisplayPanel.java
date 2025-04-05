// Komponen tampilan tambahan
public class DisplayPanel {
    private IngredientViewer viewer;

    public DisplayPanel(IngredientViewer viewer) {
        this.viewer = viewer;
    }

    public void displayContent() {
        System.out.println("Menampilkan isi kulkas di layar tambahan:");
        viewer.showAllItems();
    }
}
