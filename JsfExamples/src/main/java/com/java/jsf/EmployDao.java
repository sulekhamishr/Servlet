package com.java.jsf;

import java.util.ArrayList;
import java.util.List;

public class EmployDao {

	public List<Employ> showEmploy() {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Sulekha", "Java", "Developer", 84245.33));
		employList.add(new Employ(2, "Ishani", "J2EE", "Expert", 90442.33));
		employList.add(new Employ(3, "Swasti", "MySql", "Programmer", 88933.33));
		employList.add(new Employ(4, "Ziynab", "Angular", "Tester", 89043.33));
		employList.add(new Employ(5, "Usha", "React", "Manager", 85677.33));
		return employList;
	}
}