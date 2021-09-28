public class Islemler implements Runnable {

    String name;

    public Islemler(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 70; i++) {
                System.out.print(this.name + "-" + i + " ");
            }
        } catch (Exception e) {
            System.out.print("Hata ile karşılaşıldı.");
        }
    }
}
