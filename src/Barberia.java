class Barberia {
    private int quedenClients;
    private boolean hihaLloc;
    private int seguent;

    public Barberia() {
        quedenClients = 30;
        hihaLloc = true;
        seguent = 0;
    }

    public synchronized void entraClient() {
        quedenClients--;
        hihaLloc = false;
        notifyAll();
    }

    public synchronized int seguentClient() {
        while (quedenClients == 0) {
            hihaLloc = true;
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int resultat = seguent;
        seguent++;
        return resultat;
    }

    public synchronized boolean hihaLloc() {
        return hihaLloc;
    }

    public int getQuedenClients() {
        return quedenClients;
    }
}
