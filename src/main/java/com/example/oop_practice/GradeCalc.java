package com.example.oop_practice;


public class GradeCalc
{

		public static void grade()
		{
			Subject math = new Subject("Math", 4);
			math.addFormative("LTA","04/13/2022", 50.0, -1.0);
			math.addSummative("test", "02/26/2022", 100.0, -1.0);
			math.getAssign("LTA").setPoints(40.0);
			math.getAssign("test").setPoints(100.0);
			math.addSummative("test2", "03/17/2022", 100, 60);
			System.out.println(Helpers.toPercent(math.getAssign("LTA").getGrade()));
			System.out.println(Helpers.toPercent(math.calcSummative()));
			System.out.println(Helpers.toPercent(math.calcGrade()));
		}
}
