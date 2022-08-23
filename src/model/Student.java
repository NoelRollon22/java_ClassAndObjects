package model;

public class Student {
    String name ;
    int age;
    String gender;
    int idNum;

    public Student(String name, int age, String gender, int idNum){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNum = idNum;
    }


    //getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public static void main(String[] args){
        //print using constructor
        Student student = new Student("Noel", 22, "Male", 1);
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
        System.out.println("Gender : " + student.getGender());
        System.out.println("ID Number : " + student.getIdNum());
        //print using setters and getters
        student.setName("Mary");
        System.out.println("Name: "+ student.getName());
        student.setAge(22);
        System.out.println("Age: "+ student.getAge());
        student.setGender("Female");
        System.out.println("Gender: "+ student.getGender());
        student.setIdNum(2);
        System.out.println("ID Number: "+ student.getIdNum());



    }
}
