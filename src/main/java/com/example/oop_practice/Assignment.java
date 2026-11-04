package com.example.oop_practice;

import java.util.Locale;

public class Assignment extends Subject
{
	private String name;
    private String date;
    private double grade;
    private double points;
    private double totalPoints;
    private String type;


    public Assignment(String nameInput, String dateInput, double totalPointInput, String typeInput)
	{
		name = nameInput;
        date = dateInput;
        totalPoints = totalPointInput;
        type = typeInput.toLowerCase();
    }

    public Assignment(String nameInput, String dateInput, double totalPointInput, String typeInput, double pointsInput)
    {
	    this(nameInput,dateInput,totalPointInput,typeInput);
        points = pointsInput;
        grade = points/totalPoints;
    }

    public double getGrade()
    {
		grade = points/totalPoints;
        return grade;
    }

	public double getTotalPoints()
	{
		return totalPoints;
	}

	public double getPoints()
	{
		return points;
	}

	public void setPoints(double p)
	{
		points = p;
	}

	public String getName()
	{
		return name;
	}
}
