package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SalesReportFile {


	public static void writeReportEntry(List<VendingItem> c) { 

		try {
			File file = new File("Sales Report.txt"); // Creating a new blank file for us to add to

			if(!file.exists()) { // Checking if our file already exists for us to add to

				file.createNewFile(); // If not such file exists we need to create one
			}
			double salesTotal = 0.00; 

			PrintWriter pw = new PrintWriter(file); // Creating a new print writer "pw"
			for(int i = 0; i < c.size(); i++) {
				pw.println(c.get(i).getName() + " | " + c.get(i).getQuantity());
				salesTotal += c.get(i).getPrice();
			}
			pw.println("**TOTAL SALES** " + " $" + salesTotal);
			pw.flush();
			pw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}


	}
}







