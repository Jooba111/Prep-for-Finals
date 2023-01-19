public class Table {

    int forks;

    public Table(int forks) {
        this.forks = forks;
    }

    public boolean  forkAvailable() {
        return forks > 0;
    }

    public void  takeFork() {
        forks--;
    }

    public void returnFork() {
        forks++;
    }

}