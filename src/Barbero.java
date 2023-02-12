class Barbero implements Runnable {
    private Barberia barberia;

    public Barbero(Barberia barberia) {
        this.barberia = barberia;
    }

    public void tallarCabell() {
        System.out.println("Cortando el cabello a:[" + barberia.seguentClient() + "]");
        notifyAll();
    }

    public void ferMigdiada() {
        System.out.println("Barber haciendo siesta...");
    }

    @Override
    public void run() {
        while (true) {
            if (barberia.getQuedenClients() == 0) {
                ferMigdiada();
            } else {
                tallarCabell();
            }
        }
    }
}



