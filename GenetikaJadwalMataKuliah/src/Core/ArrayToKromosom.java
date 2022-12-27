package Core;

public class ArrayToKromosom {
    String[][] data;

    public ArrayToKromosom(String[][] data) {
        this.data = data;
    }
    
    public Kromosom setToKromosom(){
        Kromosom k = new Kromosom(data);
        return k;
    }
}
