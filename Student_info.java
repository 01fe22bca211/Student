public class Student_info{
    String name="Vaishali";
    String department="BCA";
    String program="BCA";
    public String RegistertedCourse[]={" ","C#","Applied statistics","Java"};

    public void display(){
        System.out.println("----Student Details----");
        System.out.println("Name:"+name);
        System.out.println("Department: "+department);
        System.out.println("Program:"+program);
        System.out.print("Registered Courses:\n");
        for(int i=1;i<=3;i++){
            System.out.println(i+":"+RegistertedCourse[i]);
        }
    }

    public static void main(String[] args){
        Student_info s = new Student_info();
        s.display();
        
    }
}