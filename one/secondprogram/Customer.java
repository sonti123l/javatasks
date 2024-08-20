package one.secondprogram;
public class Customer {

    private String name;
    private int creditLimit;
    private String EmailAddress;

    //getter methods
    public String getName(){
        return name;
    }

    public int getCredtLimit(){
        return creditLimit;
    }

    public String getEmailAddress(){
        return EmailAddress;
    }

    //constructors creation
    public Customer(String Name,int creditlimit,String Email){
        this.name = Name;
        this.EmailAddress = Email;
        this.creditLimit = creditlimit;
    }

    public Customer(){
        this("trishal",190,"saitrishalsonti080@gmail.com");
        System.out.println("details entered into database......");
    }

    public Customer(String personName,String Emailaddress){
        this(personName,2000,Emailaddress);
    }
}
