package map;

public class EmployeeSort {

	public static void main(String[] args) {
		Employee1 emp[]= new Employee1[5];
		emp[0]=new Employee1(101, "Uday", 15000, new Department1(201, "HR"));
		emp[1]=new Employee1(102, "Dipesh", 45000, new Department1(202, "Admin"));
		emp[2]=new Employee1(103, "Aayush", 25000, new Department1(203, "Sales"));
		emp[3]=new Employee1(104, "Adish", 50000, new Department1(204, "Developer"));
		emp[4]=new Employee1(105, "Nitish", 25000, new Department1(202, "Admin"));
		System.out.println("Before sorting");
		for(Employee1 e:emp) {
			System.out.println(e);
		}
		
		for(int i=0;i<emp.length;i++) {
			for(int j=i+1;j<emp.length;j++) {
				if(emp[i].salary<emp[j].salary) {
					int temp=emp[i].salary;
					emp[i].salary=emp[j].salary;
					emp[j].salary=temp;
				}
			}
		}
		System.out.println("After sorting");
		for(Employee1 e:emp) {
			System.out.println(e);
		}
		
		

	}

}
