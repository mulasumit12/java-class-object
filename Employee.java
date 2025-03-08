
public class Employee {
///create some attributes of the class
  public   String name;
    public int id;
    public int salary;

    //create the constructor
    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

////display method
    public  void display(){
        System.out.println("Employee name is :"+name);
        System.out.println("Employee id is :"+id);
        System.out.println("Employee salary is :"+salary);
    }

    public static void main(String[] args) {
        ///create an object
      Employee obj=new Employee("Sumit",97,25000);
      ///call the method
      obj.display();

    }
}
