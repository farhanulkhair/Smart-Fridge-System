import java.util.ArrayList;
import java.util.List;

// Komponen utama kulkas
public class FridgeUnit implements IngredientControl, IngredientViewer {
    private List<String> storage = new ArrayList<>();

    @Override
    public void addItem(String name) {
        storage.add(name);
        System.out.println(name + " ditambahkan ke dalam kulkas.");
    }

    @Override
    public void removeItem(String name) {
        if (storage.remove(name)) {
            System.out.println(name + " dihapus dari kulkas.");
        } else {
            System.out.println(name + " tidak ditemukan di kulkas.");
        }
    }

    @Override
    public boolean containsItem(String name) {
        return storage.contains(name);
    }

    @Override
    public void showAllItems() {
        if (storage.isEmpty()) {
            System.out.println("Kulkas kosong.");
        } else {
            System.out.println("Isi kulkas:");
            for (String item : storage) {
                System.out.println("- " + item);
            }
        }
    }
}
