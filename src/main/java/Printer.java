public class Printer {

    private int paper;
    private int ink;

    public Printer(int paper, int ink) {
        this.paper = paper;
        this.ink = ink;
    }

    public int getPaper() {
        return this.paper;
    }

    public int getInk() {
        return this.ink;
    }

    public void print(int pages, int copies){
        int sheetsRequired = pages * copies;
        if (sheetsRequired <= this.paper && sheetsRequired <= this.ink) {
            this.paper -= sheetsRequired;
            this.ink -= sheetsRequired;
        }
    }
}