package ExamMiddle;


import java.util.*;



class Employee {
    private String name;
    private int old;
    private int salary;
    
    public Employee (String name, int old, int salary) {
        this.name = name;
        this.old = old;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
     public int getOld() {
        return old;
    }
    public int getSalary() {
        return salary;
    }
}
class SalsesEmployee extends Employee {
    private int doanhSo;
    public SalsesEmployee(String name, int old, int salary, int doanhSo) {
       super(name, old, salary);
       this.doanhSo = doanhSo;
    }

    public void Display() {
        System.out.println( getName() + " " +getOld()+" "+getSalary()+" "+doanhSo);
    }
}
class TechnicalEmployee extends Employee {
    private int soGio;
    public TechnicalEmployee(String name, int old, int salary, int soGio) {
       super(name, old, salary);
       this.soGio = soGio;
    }
    public void Display() {
        System.out.println( getName() + " " +getOld()+" "+getSalary()+" "+soGio);
    }
    public double tinhLuong() {
        return (getSalary()+0.1*soGio*getSalary());
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<TechnicalEmployee> t = new ArrayList<>();
        t.add(new TechnicalEmployee("John", 30, 3000, 160));
        t.add(new TechnicalEmployee("Alice", 35, 3500, 150));
        t.add(new TechnicalEmployee("Bob", 25, 2500, 170));
        // Tìm nhân viên kỹ thuật có mức lương cao nhất
        TechnicalEmployee h = luong(t);
        System.out.println("nhan vien luong cao nhat ");
         h.Display();
        // Sắp xếp các nhân viên kỹ thuật theo mức lương thực tế giảm dần
        Collections.sort(t, Comparator.comparingDouble(TechnicalEmployee::tinhLuong).reversed());
        for(TechnicalEmployee i : t) {
            System.out.println(i.tinhLuong());
        }
    }
    public static TechnicalEmployee luong(ArrayList<TechnicalEmployee> t) {
        TechnicalEmployee t1 = t.get(0); // lay tk dau tien
        for(TechnicalEmployee t2 : t) {
            if(t2.getSalary() > t1.getSalary()) {
                t1 = t2;
            }
        }
       return t1;
    }
}
