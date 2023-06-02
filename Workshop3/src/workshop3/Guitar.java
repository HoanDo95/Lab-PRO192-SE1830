
package workshop3;

/**
 *
 * @author HOAN DO
 */
public class Guitar {
    //fields
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
    // method
    public Guitar(){
        serialNumber = "";
        price = 0;
        builder = "";
        model = "";
        backWood = "";
        topWood = "";
    }
    public Guitar(String serialNumber, int price, String builder,String model, String backWood, String topWood){
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
        
    }
    public String getSerialNumber(){
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber){
       if(!serialNumber.isEmpty()){
        this.serialNumber = serialNumber;
    }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
    
    public void createSound(){
        System.out.println("Serial Number: " + this.getSerialNumber());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Builder: " + this.getBuilder());
        System.out.println("Model: " + this.getModel());
        System.out.println("Back Wood: " + this.getBackWood());
        System.out.println("Top Wood: " + this.getTopWood());
    }

    @Override
    public String toString() {
        return "Guitar{" + "serialNumber=" + serialNumber + ", price=" + price + ", builder=" + builder + ", model=" + model + ", backWood=" + backWood + ", topWood=" + topWood + '}';
    }
}
