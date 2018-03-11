class Employee{
    private int age;
    private double salary;
    private String name;
    private int NextEmployee_id;
     

    private static int EmployeeID=1;

    public Employee ( String name, int age, double salary){
    	this.name=name;
    	this.age=age;
	this.salary=salary;
	NextEmployee_id= EmployeeID++;
	
    }
    public int getAge(){
	return age;
    }

    public double getSalary(){
	return salary;
    }

    public int getID(){
	return NextEmployee_id;
    }

    public String getName(){
	return name;
    }


    public static int getNextID(){
	return EmployeeID;
    }
   

}