public class NaoPereciveis extends Produto{

    private String type;

    public NaoPereciveis(String name, double price,String type) {
        super(name,price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type= '" + type + '\'' + '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
