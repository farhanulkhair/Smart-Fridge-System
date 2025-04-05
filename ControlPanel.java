import java.util.Scanner;

// Kontrol utama oleh user, membutuhkan IngredientControl & SyncService
public class ControlPanel {
    private IngredientControl control;
    private SyncService syncService;

    public ControlPanel(IngredientControl control, SyncService syncService) {
        this.control = control;
        this.syncService = syncService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Panel Kontrol Kulkas ===");
            System.out.println("1. Tambah Bahan");
            System.out.println("2. Hapus Bahan");
            System.out.println("3. Sinkronisasi Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama bahan: ");
                    String addItem = scanner.nextLine();
                    control.addItem(addItem);
                    break;
                case 2:
                    System.out.print("Nama bahan: ");
                    String delItem = scanner.nextLine();
                    control.removeItem(delItem);
                    break;
                case 3:
                    syncService.syncItems();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan kulkas pintar!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
