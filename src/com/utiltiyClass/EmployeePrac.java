package com.utiltiyClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeePrac {

	public static void main(String[] args) {
		
		class Employee implements Comparable{
			private Integer id;
			private String name;
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			Employee(Integer id, String name){
				this.id = id;
				this.name = name;
			}
			public String toString() {
				return this.name+"-"+this.id;
			}
			@Override
			public int compareTo(Object obj) {
				String name1 = this.name;
				Employee emp = (Employee)obj;
				String name2 = emp.getName();
				return name1.compareTo(name2);
			}
		}
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(123, "sandeep"));
		empList.add(new Employee(456, "muneer"));
		empList.add(new Employee(789, "srinivas"));
		System.out.println(empList);
		
		Collections.reverse(empList);
		System.out.println(empList);
		
		Collections.sort(empList);
		System.out.println("sorted "+empList);

	}
	
}
