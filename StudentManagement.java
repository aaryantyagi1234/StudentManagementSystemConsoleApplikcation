import java.util.*;

public class StudentManagement
{    
  ArrayList<student> Students= new ArrayList();
  Scanner sc = new Scanner(System.in);

public void addStudent()
{
   System.out.println("Enter Rollno");
   int Rollno = sc.nextInt();
sc.nextLine();
   
System.out.println("Enter Name");
String Name = sc.nextLine();

System.out.println("Enter age");
int AGE = sc.nextInt();
sc.nextLine();
System.out.println("Enter Course");
String Course = sc.nextLine();

student s = new student(Rollno , Name ,Course , AGE  );
Students.add(s);
}
public void viewStudents()
{
    for(int i=0;i<Students.size();i++)
    {
        student S = Students.get(i);
        System.out.println(S.getName()+"aaaaaaaaaaaaa");
        System.out.println(S.getRollno()+ " " +S.getName() + " " + S.getCourse() + " " +S.getAge());
    }
}
}
    



        