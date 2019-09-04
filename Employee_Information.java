import java.util.Scanner;
class Designation{
	String designation_code;
	String designation;
	int da;
	void input(String designation_code,String designation,int da){
	this.designation_code=designation_code;
	this.designation=designation;
	this.da=da;
}
}
class Project1 extends Designation {
	int emp_no;
	String emp_name;
	String join_date;
	String designation_code;
	String department;
	int basic;
	int hra;
	int it;

public void input(int emp_no,String emp_name,String join_date, String designation_code, String department,int basic,int hra,int it ){
	this.emp_no=emp_no;
	this.emp_name=emp_name;
	this.join_date=join_date;
	this.designation_code=designation_code;
	this.department=department;
	this.basic=basic;
	this.hra=hra;
	this.it=it;

}
public int calculate_salary(int da){
	int salary;
	salary=basic+hra+da-it;
	return(salary);

}


}

class EmployeeSearch{
	public static void main(String[] args){
	Project1[] studentArray = new Project1[5];
	Designation[] studentArray1 = new Designation[3];
	String fetchcode="/o";
	int da;
	int k=0;
	String des="/o";
	Project1 obj1 =new Project1();
	for ( int i=0; i<studentArray.length; i++) {
	studentArray[i]=new Project1();
	}
	for ( int i=0; i<studentArray1.length; i++) {
	studentArray1[i]=new Designation();
	}
	studentArray[0].input(1001,"Ashish","01/04/2009","e","R&D",2000,8000,3000);
	studentArray[1].input(1002,"Shyam","02/04/2009","c","PM",30000,9000,4000);
	studentArray[2].input(1003,"Rahul","03/04/2009","k","Acct",40000,12000,5000);
	studentArray[3].input(1004,"Chahat","04/04/2009","r","Front Desk",60000,8000,6000);
	studentArray[4].input(1005,"Arjun","05/04/2009","m","Engg",60000,8000,7000);
	studentArray1[0].input("e","engineer",20000);
	studentArray1[1].input("c","consultant",32000);
	studentArray1[2].input("k","clerk",12000);
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	for ( int i=0; i<studentArray.length; i++) {
	if(a==studentArray[i].emp_no){
	fetchcode=studentArray[i].designation_code;
	obj1=studentArray[i];
	}
	}
	for ( int i=0; i<studentArray1.length; i++) {
	if(fetchcode==studentArray1[i].designation_code){
	da=studentArray1[i].da;
	k=obj1.calculate_salary(da);
	des=studentArray1[i].designation;
	}
	}
	System.out.println(obj1.emp_no);
	System.out.println(obj1.emp_name);
	System.out.println(obj1.department);
	System.out.println(des);
	System.out.println(k);

	}
}
