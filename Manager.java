package Code;

public class Manager extends Employee {
	private int perfBonus;
	private double NetSal;

	public Manager(int id, String name, int deptId, double basicSalary,int perfBonus) {
		super(id, name, deptId, basicSalary);
		this.perfBonus=perfBonus;
	}

	@Override
	public String toString() {
		return  super.toString()+"perfBonus=" + perfBonus + ", basicSalary=" + basicSalary ;
				
	}

	@Override
	public double ComputeNetSal() {
	       return NetSal=basicSalary+perfBonus;
	}

	public int getPerfBonus() {
		return perfBonus;
	}
	
	

}
