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
        String normalizedKey = name.toLowerCase();
        boolean found = false;

        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).toLowerCase().equals(normalizedKey)) {
                storage.remove(i);
                System.out.println(name + " dihapus dari kulkas.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(name + " tidak ditemukan di kulkas.");
        }
    }

    @Override
    public boolean containsItem(String name) {
        String normalizedKey = name.toLowerCase();
        for (String item : storage) {
            if (item.toLowerCase().equals(normalizedKey)) {
                return true;
            }
        }
        return false;
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