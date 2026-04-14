public class Service {
    private int id;
    private String name;
    private int prices;
    public Service(int id, String name, int prices) {
        this.id = id;
        this.name = name;
        this.prices = prices;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }
}
