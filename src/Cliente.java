class Cliente implements Runnable {
    private Barberia barberia;
    private int id;

    public Cliente(Barberia barberia, int id) {
        this.barberia = barberia;
        this.id = id;
    }

    public void esperaQueCreixiElCabell() {
        System.out.println("Esperando a que crezca el cabello el cliente: [" + id + "]");
    }

    @Override
    public void run() {
        while (true) {
            if (barberia.hihaLloc()) {
                barberia.entraClient();
                System.out.println("Entra en [" + id + "] el cliente: [" + id + "]");
            } else {
                esperaQueCreixiElCabell();
            }
        }
    }
}