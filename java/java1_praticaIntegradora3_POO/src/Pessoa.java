public class Pessoa {

    private String id;
    private String name;
    private int age;
    private double weight;
    private double stature;


    public Pessoa() {

    }

    public Pessoa(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Pessoa(String id, String name, int age, double weight, double stature) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.stature = stature;
    }

    public int calculateBMI() {
        double calculate = this.weight / (Math.pow(this.stature, 2));

        if (calculate < 20.0) {
            return -1;
        } else if (calculate > 20.0 && calculate < 26) {
            return 0;
        }

        return 1;
    }

    public boolean isLegalAge() {

        if (this.age > 17) {
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        return "==========INFORMACÕES DA PESSOA==========\n" +
                "ID= " + id  + "\n"+
                "Nome = " + name  +
                " Idade = " + age  + "\n" +
                "Peso = " + weight + "KG" +
                " Altura = " + stature +
                "\n========================================";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getStature() {
        return stature;
    }

    public void setStature(double stature) {
        this.stature = stature;
    }
}
