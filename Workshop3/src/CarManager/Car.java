
package CarManager;

public class Car {
//fields
private String Colour;
private int EnginePower;
private boolean Convertible;
private boolean parkingBrake;
//methods
public Car(){
    Colour = "";
    EnginePower = 0;
    Convertible = false;
    parkingBrake = false;
}    
 public Car(String Colour, int EnginePower, boolean Convertible, boolean parkingBrake){
     this.Colour = Colour;
     this.EnginePower = EnginePower;
     this.Convertible = Convertible;
     this.parkingBrake = parkingBrake;
 }   
    public void pressStartButton(){
        System.out.println("You can press the star button");
    }
    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }
    public void setColour(String Colour){
        this.Colour = Colour;
    }
    public String getColour(){
        return Colour;
    }
    public int getEnginePower(){
        return EnginePower;
    }
    public void setEnginePower(int EnginePower){
        this.EnginePower = EnginePower;
    }
    public boolean isConvertible(){
        return Convertible;
    }
    public void setConvertible(boolean Convertible){
        this.Convertible = Convertible;
    }
    public boolean isParkingBrake(){
        return parkingBrake;
    }
    public void setParkingBrake(boolean parkingBrake){
        this.parkingBrake = parkingBrake;
    }
@Override
    public String toString() {
        return "Car{" + "Colour=" + Colour + ", EnginePower=" + EnginePower + ", convertible=" + Convertible + ", parkingBrake=" + parkingBrake + '}';
    }
}
