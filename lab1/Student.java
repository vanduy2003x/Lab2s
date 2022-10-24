package lab1;

public class Student {
    public static int id = 0;
    private int mid;
    private String name;
    private String  address;
        public Student(){
            mid = id++;
        }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int mid, String name, String address) {
        this.mid = mid;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mid=" + mid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
