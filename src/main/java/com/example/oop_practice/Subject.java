package com.example.oop_practice;

import java.util.ArrayList;

public class Subject
{

    private String name;
    private int period;
    private double formativeGrade;
    private double summativeGrade;
    private double grade;
    private ArrayList<Assignment> formative = new ArrayList();
    private ArrayList<Assignment> summative = new ArrayList();


    public Subject()
    {
        name = "";
        period = 0;
    }
    public Subject(String nameInput, int periodInput)
    {
        name = nameInput;
        period = periodInput;
    }

    public void changeGrade(double gradeInput)
    {
        grade = gradeInput;
    }

    public int whatPeriod()
    {
        return period;
    }

    public double calcGrade()
    {
        grade = (calcFormative()*0.39)+(calcSummative()*0.61);
        return grade;
    }

    public void addFormative(String nameInput, String dateInput, double totalPointInput, double pointsInput)
    {
        formative.add((pointsInput==-1.0) ? new Assignment(nameInput,dateInput,totalPointInput,"formative") : new Assignment(nameInput,dateInput,totalPointInput,"formative",pointsInput));
    }

    public void addSummative(String nameInput, String dateInput, double totalPointInput, double pointsInput)
    {
        summative.add((pointsInput==-1.0) ? new Assignment(nameInput,dateInput,totalPointInput,"summative") : new Assignment(nameInput,dateInput,totalPointInput,"summative",pointsInput));
    }

    public double calcSummative()
    {
        double points = 0;
        double totalPoints = 0;
        for (int i=0; i<summative.size(); i++)
        {
            points += summative.get(i).getPoints();
            totalPoints += summative.get(i).getTotalPoints();
        }
        summativeGrade = points/totalPoints;
        return summativeGrade;
    }

    public double calcFormative()
    {
        double points = 0;
        double totalPoints = 0;
        for (int i=0; i<formative.size(); i++)
        {
            points += formative.get(i).getPoints();
            totalPoints += formative.get(i).getTotalPoints();
        }
        formativeGrade = points/totalPoints;
        return formativeGrade;
    }

    public Assignment getAssign(String name)
    {
        Assignment result = null;
        boolean found = false;
        for (int i=0; i<formative.size() && !found; i++)
        {
            if (formative.get(i).getName().equals(name))
            {
                result = formative.get(i);
            }
        }
        for (int i=0; i<summative.size() && !found; i++)
        {
            if (summative.get(i).getName().equals(name))
            {
                result = summative.get(i);
            }
        }
        return result;
    }

}
