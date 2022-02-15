package prob2A;

public class Student 
{
	private String name;
	private GradeReport report;
	public Student(String name) 
	{
		this.name= name;
		report = new GradeReport(this);
		
	}
	public String getName() {
		return name;
	}
	public GradeReport getReport() {
		return report;
	}
	
	@Override
	public String toString() {
		return name + ": " + report;
	}
	
}
