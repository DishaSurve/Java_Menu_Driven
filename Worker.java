package Code;

public class Worker extends Employee {
    private int HoursWorked;
    private int HourlyRate;
    private double NetSal;
	public Worker(int id, String name, int deptId, double basicSalary,int HourlyRate,int HoursWorked) {
		super(id, name, deptId, basicSalary);
		this.HourlyRate=HourlyRate;
		this.HoursWorked=HoursWorked;
		
	}
	@Override
	public String toString() {
		return  super.toString() + "HoursWorked=" + HoursWorked + ", HourlyRate=" + HourlyRate + ", basicSalary=" + basicSalary;
	}
	@Override
	public double ComputeNetSal() {
		// TODO Auto-generated method stub
		return NetSal=basicSalary+(HoursWorked*HourlyRate);
	}
	public int getHourlyRate() {
		return HourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		HourlyRate = hourlyRate;
	}
	

}
