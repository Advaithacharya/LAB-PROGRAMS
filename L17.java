class Car{
    private String make;
    private String mode1;
    private int year;
    private String color;
    Car(String mk,String md,int yr,String clr){
        this.make=mk;
        this.mode1=md;
        this.year=yr;
        this.color=clr;
    }
    public void getCarDetails(){
    System.out.println(color+" "+make+"-"+mode1+" "+year);
    }
}    
public class L17{
    public static void main(String[] args){
        Car principalCar=new Car("Hyundai","120",2022,"white");
        Car vprincipalCar=new Car("Maruthi","Swift",2022,"grey");
        System.out.println("These two cars parked in front of SMVITM are");
        principalCar.getCarDetails();
        vprincipalCar.getCarDetails();
        
    }
}

