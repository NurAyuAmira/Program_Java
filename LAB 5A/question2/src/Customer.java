public class Customer{
    private String name;
    private String ID;

    public Customer(String name,String ID){
        this.name = name;
        this.ID = ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getName(){
        return name;
    }

    public String getID(){
        return ID;
    }
}