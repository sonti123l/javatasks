package one.firstprogram;
public class Worker {
    
    //attribute creation
    private String Name;
    private String birthDate;
    private String endDate;


    //constructor
    public Worker(String name,String birthDate){
        this.Name = name;
        this.birthDate = birthDate;
    }

    //getter method of GetAge
    public int getAge(){
        int Age = 2025-Integer.parseInt(this.birthDate);
        return Age;
    }

    public double collectPay(){
        return 750.00;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }    

    public String toString(){
        return "Worker Details are "+ "name is {"+this.Name+"} Age is " + getAge(); 
    }
}
