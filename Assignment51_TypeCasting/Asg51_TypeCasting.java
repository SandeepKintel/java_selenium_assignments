package Assignment51_TypeCasting;
class Employee{
	static void showname1() {
		System.out.println("Mukesh Static");
		}
	static void showname2() {
		System.out.println("Ramesh Static");
		}
	void showname3() {
		System.out.println("Suresh Static");
		}
	void showname4() {
		System.out.println("Sheetal Static");
		}
	}
public class Asg51_TypeCasting extends Employee {
	static void SalaryMukesh() {
		System.out.println("Mukesh's Salary is " + 15000);
		}
	static void SalaryRamesh() {
		System.out.println("Ramesh's Salary is " + 20000);
		}
	void SalarySuresh() {
		System.out.println("Suresh's Salary is " + 22000);
		}
	void SalarySheetal() {
		System.out.println("Sheetal's Salary is " + 25000);
		}
	public static void main(String[] args) {
		Employee e1= new Asg51_TypeCasting();
		Asg51_TypeCasting asg = (Asg51_TypeCasting) e1;
		Employee.showname1();
		Employee.showname2();
		asg.showname3();
		asg.showname4();
		asg.SalarySuresh();
		Asg51_TypeCasting.SalaryMukesh();
		Asg51_TypeCasting.SalaryRamesh();
		asg.SalarySheetal();
		}
}
