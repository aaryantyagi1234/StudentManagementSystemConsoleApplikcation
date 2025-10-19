class student
{
    private int rollno;
    private String Name;
    private String course;
    private int age;
    
    public student ( int rollno, String name,String course,int age)
    {
        this.rollno= rollno;
        this.Name = name;
        this.course = course;
        this.age = age;
    }
    public String getName()
    {
        return Name;
        
    }
    public void setName(String Name)
    {
        this.Name= Name;
        
    }
    public int getAge()
{
    return age;
}
public void setAge(int age)
{
    this.age = age;
}

public String getCourse()
{
    return course;
    
}
public void setCourse(String Course)
{
    this.Name = Name;
}
public int getRollno()
{
 return rollno;
}

public void setRollno(int rollno)
    {
        this.rollno = rollno;
    }
    
    }
