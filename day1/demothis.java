class student
 {
      String name,dept;
      int age;
 
      student(String name,int age,String dept)
      {
       this.name=name;
       this.dept=dept;
       this.age=age;
 
      }
 
      public void displayStudent()
      {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Department="+dept);
       
      }
 }
 
 class demothis
  {
      public static void main(String[] args) {
          student obj=new student("x",31,"CSE");
          obj.displayStudent();
      }
  }
