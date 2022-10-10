public class Demo3 {
    public static void main(String[] args) {

    }
}

class CreditManager {
    public void calculate() {
        System.out.println("Hesaplandi");
    }

    public void save() {
        System.out.println("Kredi verildi");
    }
}



class Customer {

    public Customer() {
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

class Person extends Customer {
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

class Company extends Customer {
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

class CustomerManager {
    private Customer1 _customer;

    public CustomerManager(Customer1 customer) {
        _customer = customer;
    }

    public void save() {
        System.out.println("Customer saved: " + _customer);
    }

    public void delete() {
        System.out.println("Customer deleted: " + _customer);
    }
}
