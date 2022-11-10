package relevos;

public class HiloCorredor extends Thread{

    public HiloCorredor(String nombre){
        setName(nombre);
    }

    @Override
    public void run() {
        System.out.println("Soy el hilo "+getName()+", corriendo...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (getName().equals("4")){
            System.out.println("Terminé la carrera soy el último");
        }
        else{
            System.out.println("Terminé. Paso el testigo.");
        }
    }
}
