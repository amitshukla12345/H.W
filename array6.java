class array6
{
	public static void main(String args[])
	{
	String courses[][]={{"HTML","CSS","Javascript","Mysql",
	"MongoDB","Core java","Spring Boot"}};
	
	int Total_courses=0;
	for(String course[]:courses)
	{
		Total_courses+=course.length;
		for(String c_name:course)
		{
			System.out.println(c_name);
		}
	}
	System.out.println("Total courses:"+Total_courses);
	}
}