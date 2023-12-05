package emp;

public class Employee {
	private int empNo;
	private String empName;
	private String empAddress;
	public Employee(int empNo, String empName, String empAddress) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	public Employee() {
		super();
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
}
