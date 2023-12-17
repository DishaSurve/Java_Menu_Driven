package Code;

public class Employee {
	private int id;
	private String name;
	private int deptId;
	protected double basicSalary;
	public Employee(int id,String name,int deptId,double basicSalary) {
		this.id=id;
		this.name=name;
		this.deptId=deptId;
		this.basicSalary=basicSalary;
	}
	@Override
	public String toString() {
		return "Employee Details [id=" + id + ", name=" + name + ", deptId=" + deptId + ", basicSalary=" + basicSalary + "]";
	}
	public double ComputeNetSal() {
		return 0;
	}

}
