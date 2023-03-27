package Task1;

public class Cat {
    private int height;
    private int weight;
    private String name;

    public Cat(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }
    public Cat(){
        this.height = 1;
        this.weight = 2;
        this.name = "Vasya";
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
