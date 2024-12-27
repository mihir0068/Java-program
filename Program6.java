import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age + " city: " + city;
    }
}

class Student extends Person {

    public String grade;

    public Student(String name, int age, String city, String grade) {
        super(name, age, city);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public String toString() {
        return super.toString() + "grade: " + grade;
    }
}

class Teacher extends Person {

    public double salary;

    public Teacher(String name, int age, String city, double salary) {
        super(name, age, city);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return super.toString() + " Salary: " + salary;
    }
}

public class Program6 {
    static Scanner scanner = new Scanner(System.in);
    public static Student[] student = new Student[5];
    public static Teacher[] teacher = new Teacher[5];
    public static int studentCount = 0;
    public static int teacherCount = 0;

    public static void main(String[] args) {
        System.out.println("-------School management system-------");

        while (true) {
            System.out.println("\n1.Student");
            System.out.println("2.Teacher");
            System.out.println("3.Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n1.Add Student");
                        System.out.println("2.View Student");
                        System.out.println("3.Delete Student");
                        System.out.println("4.Exit");
                        System.out.print("Enter your choice: ");
                        int studentChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (studentChoice) {
                            case 1:
                                addNewStudents();
                                break;

                            case 2:
                                viewStudents();
                                break;
                            case 3:
                                deleteStudent();
                                break;
                            case 4:
                                break;
                            default:
                                break;
                        }
                        if (studentChoice == 4)
                            break;
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("\n1.Add New Teacher");
                        System.out.println("2.View Teacher");
                        System.out.println("3.Delete Teacher");
                        System.out.println("4.Exit");
                        System.out.print("Enter your choice: ");
                        int teacherChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (teacherChoice) {
                            case 1:
                                addNewTeacher();
                                break;

                            case 2:
                                viewTeachers();
                                break;
                            case 3:
                                deleteTeacher();
                                break;
                            case 4:
                                break;
                            default:
                                break;
                        }
                        if (teacherChoice == 4)
                            break;
                    }
                    break;

                case 3:
                    System.exit(1);
                    break;

                default:
                    System.out.println("Invalid choice.. try again!!");
            }
        }
    }

    public static void addNewStudents() {
        if (studentCount >= student.length) {
            System.out.println("Student limit reached. Can't add more students.");
            return;
        }

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter City:");
        String city = scanner.next();
        scanner.nextLine();

        System.out.println("Enter Grade:");
        String grade = scanner.nextLine();

        student[studentCount++] = new Student(name, age, city, grade);
        System.out.println("-------Student added successfully--------");
    }

    public static void viewStudents() {
        if (studentCount == 0) {
            System.out.println("No Any student data available.");
            return;
        }
        System.out.println("----------Student List-----------");
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + " " + student[i]);
        }
    }

    public static void deleteStudent() {
        if (studentCount == 0) {
            System.out.println("No student data availeble.");
            return;
        }

        System.out.println("Enter Id Of student to delete");
        int stuId = scanner.nextInt();

        if (stuId < 1 || stuId > studentCount) {
            System.out.println("Invalid student number.");
            return;
        }

        for (int i = stuId - 1; i < studentCount - 1; i++) {
            student[i] = student[i + 1];
        }

        student[--studentCount] = null;
        System.out.println("-------Student deleted successfully--------");
    }

    public static void addNewTeacher() {
        if (teacherCount >= teacher.length) {
            System.out.println("You can't add new teacher list is full...");
        }
        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter City:");
        String city = scanner.next();
        scanner.nextLine();

        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();

        teacher[teacherCount++] = new Teacher(name, age, city, salary);
        System.out.println("-------Teacher added successfully--------");
    }

    public static void viewTeachers() {
        if (teacherCount == 0) {
            System.out.println("No teacher records.");
        }

        System.out.println("----------Teacher List-----------");
        for (int i = 0; i < teacherCount; i++) {
            System.out.println((i + 1) + " " + teacher[i]);
        }
    }

    public static void deleteTeacher() {
        if (teacherCount == 0) {
            System.out.println("No data availble to delete");
        }
        System.out.println("Enter No of teacher to delete");
        int teacherId = scanner.nextInt();

        if (teacherId > teacherCount || teacherId < 1) {
            System.out.println("Enter valid id to delete");
        }

        for (int i = teacherId - 1; i < teacherCount - 1; i++) {
            teacher[i] = teacher[i + 1];
        }
        student[--studentCount] = null;
        System.out.println("-------Teacher deleted successfully--------");
    }
}