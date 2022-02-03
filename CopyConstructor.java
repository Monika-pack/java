
public class CopyConstructor {

	
		
		    private int studentId;
		    private String studentName, studentAddress, collegeName;
		    
		    public CopyConstructor(int studentId, String studentName, String studentAddress)
		    {
		        this.studentAddress=studentAddress;
		        this.studentName=studentName;
		        this.studentId=studentId;
		        this.collegeName="NIT";
		    }
		    
		    public static void main(String[] args) {
		    }
		    
		    
		    public CopyConstructor(int studentId, String studentName, String studentAddress, String collegeName)
		    {
		    	
		    
		        this(studentId, studentName, studentAddress);//invoking a constructor
		        this.collegeName=collegeName;
		    }
		    
		    public int getStudentId()
		    {
		        return this.studentId;
		    }
		    
		    public String getStudentName()
		    {
		        return this.studentName;
		    }
		    

	
		    
    
    public String getCollegeName()
    {
        return this.collegeName;
    }
}

