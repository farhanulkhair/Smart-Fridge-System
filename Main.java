// Main Class
public class Main {
    public static void main(String[] args) {
        // Inisialisasi kelas implementasi
        FridgeUnit fridge = new FridgeUnit();
        DataCenter dataCenter = new DataCenter(fridge);

        // Beri FridgeUnit dan DataCenter ke panel-panel
        ControlPanel controlPanel = new ControlPanel(fridge, dataCenter);
        DisplayPanel displayPanel = new DisplayPanel(fridge);

        // Jalankan program
        controlPanel.start();              
        displayPanel.displayContent(); 
    }
}
