public class Demo3Interface {
    public static void main(String[] args) {
        CustomerManager1 manager1 = new CustomerManager1(new Person1(), new SoldierCreditManager());
        manager1.giveCredit();
    }
}

class CreditManager1 {
    public void calculate() {
        System.out.println("Hesaplandi");
    }

    public void save() {
        System.out.println("Kredi verildi");
    }
}

abstract class BaseCreditManager implements ICreditManager{
    public abstract void calculate();

    public void save() {
        System.out.println("Saved.");
    }
}

interface ICreditManager{
    void calculate();
    public void save();
}
class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

    @Override
    public void calculate() {
        System.out.println("Teacher credit calculated");
    }

}

class SoldierCreditManager implements ICreditManager {

    @Override
    public void calculate() {
        System.out.println("Soldier credit calculated");
    }

    @Override
    public void save() {

    }
}
class Customer1 {

    public Customer1() {
        System.out.println("Customer object created");
    }

    public int id;

    public String city;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }
}

class Person1 extends Customer1 {
    public String firstName;
    public String lastName;
    public String nationalIdentity;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalIdentity='" + nationalIdentity + '\'' +
                '}';
    }
}

class Company1 extends Customer1 {
    public String companyName;
    public String taxNumber;

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                '}';
    }
}

class CustomerManager1{
    private Customer1 _customer;
    private ICreditManager _creditManager;

    public CustomerManager1(Customer1 customer,ICreditManager creditManager) {
        _customer = customer;
        _creditManager = creditManager;
    }

    public void save() {
        System.out.println("Customer saved: " + _customer);
    }

    public void delete() {
        System.out.println("Customer deleted: " + _customer);
    }

    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi");
    }
}
