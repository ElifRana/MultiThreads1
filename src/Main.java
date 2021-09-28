public class Main {

    public static void main(String[] args) {
	// write your code here

        Islemler i1 = new Islemler("T");
        Thread t1 = new Thread(i1);

        Islemler i2 = new Islemler("T");
        Thread t2 = new Thread(i2);

        t1.start();
        t2.start();
    }
}
