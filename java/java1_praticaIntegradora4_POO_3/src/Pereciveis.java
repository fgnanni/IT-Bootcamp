public class Pereciveis extends Produto{

    int expiredDate;

    public Pereciveis(String name, double price,int expiredDate) {
        super(name, price);
        this.expiredDate = expiredDate;
    }

    @Override
    public double calculateProduct(int expiredDate) {

        int reduction;

        switch (expiredDate){

            case 1:
                reduction = 4;
                break;

            case 2:
                reduction = 3;
                break;

            case 3:
                reduction = 2;
                break;

            default:
                reduction = 1;
                break;

        }

        return (this.getExpiredDate() * this.getPrice())/reduction;
    }

    @Override
    public String toString() {
        return super.toString() + ", expiredDate= " + expiredDate + '}';
    }

    public int getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(int expiredDate) {
        this.expiredDate = expiredDate;
    }
}
