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

    public int print(int copies){
        if (this.paper >= copies) {
            return this.paper -= copies;
        } else {
            return this.paper;
        }
    }

}