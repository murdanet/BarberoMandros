class Barrio {
    public static void main(String[] args) {
        Barberia barberia = new Barberia();
        Barbero barbero = new Barbero(barberia);
        Cliente[] clients = new Cliente[30];

        Thread t1 = new Thread(barbero);
        t1.start();

        for (int i = 0; i < 30; i++) {
            clients[i] = new Cliente(barberia, i);
            Thread t2 = new Thread(clients[i]);
            t2.start();
        }}}