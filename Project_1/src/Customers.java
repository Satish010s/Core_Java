public class Customers {
    String name;
    String carNo;
    String carType;
    public Customers(String name, String carNo, String carType) {
        this.name = name;
        this.carNo = carNo;
        this.carType = carType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


}
