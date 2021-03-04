
import java.util.ArrayList;

import java.util.List;

class Student implements Comparable<Student> {
  public Student(String name, double grade) {
    this.name = name;
    this.grade = grade;
  }

  String name;
  double grade;
 

  @Override
  public int compareTo(Student o) {
    if (o == null) {
      return -1;
    }
    int c = Double.valueOf(grade).compareTo(o.grade);
    if (c != 0) {
      return c;
    }
    return name.compareTo(o.name);
   
  }

  @Override
  public String toString() {
    return String.format("%s has grade %.2f", name, grade);
  }


public static void main(String[] args) {
  List<Student> al = new ArrayList<>();
  al.add(new Student("Zara", 3434.34));
  al.add(new Student("Daisy", 99.22));
  al.add(new Student("Qadir", -19.08));
  al.add(new Student("Ayan", 1378.00));
  
  System.out.println(al);
}

}	