//Person class object with suitable overloaded constructors.
class entry
{
    String name;
    int age;
    String gender;

    public entry(){
        System.out.println("No arguments.");

    }

    public entry(String i, int j, String k){
        name = i;
        age = j;
        gender = k;
        System.out.println("Name : "+name+", Age : "+age+", Gender : "+gender);
    }

    public entry(entry obj2){
        System.out.println("Name : "+name+", Age : "+age+", Gender : "+gender);
    }

}

public class Person{

    public static void main(String[] args) {

        entry obj = new entry();
        entry obj1 = new entry("Sourav", 18, "Male");
        entry obj2 = new entry("Dipti",18,"Male");

    }
}
