package relevos;

public class Relevo{

    public static void main(String[] args) {

        HiloCorredor h1 = new HiloCorredor("1");
        HiloCorredor h2 = new HiloCorredor("2");
        HiloCorredor h3 = new HiloCorredor("3");
        HiloCorredor h4 = new HiloCorredor("4");

        try {
            h1.start();
            h1.join();
            h2.start();
            h2.join();
            h3.start();
            h3.join();
            h4.start();
            h4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
