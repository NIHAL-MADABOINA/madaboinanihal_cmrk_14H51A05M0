
import java.util.Date;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
       
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
if(student==null){
	try {
	    throw new IllegalArgumentException("Threw an IllegalArgumentException");
	} catch(IllegalArgumentException e) {
	    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
	}
}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index==0||index>=students.length)
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		return students[index-1];
	}

	@Override
	public void setStudent(Student student, int index) {
		if(index==0||index>=students.length)
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		if(student==null){
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		}
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		if(student==null){
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		}
		int i;
		for(i=students.length;i>=0;i--){
			students[i+1]=students[i];
			
		}
      students[0]=student;  
      
	}

	@Override
	public void addLast(Student student) {
		if(student==null){
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		}
		
		students[students.length]=student;
	}

	@Override
	public void add(Student student, int index) {
		if(index==0||index>=students.length)
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		if(student==null){
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		}
		
		int i;
		for(i=students.length;i>=index;i--){
			students[i+1]=students[i];
			
		}
      students[index]=student;  
	}

	@Override
	public void remove(int index) {
		if(index==0||index>=students.length)
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		int i;
		for(i=index;i<students.length;i++){
			students[i]=students[i+1];
			
		}
	}

	@Override
	public void remove(Student student) {
		if(student==null){
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		}
		// Add your implementation here
		int i=0;
		for(i=0;i<students.length;i++){
			if(student.getId()==(students[i].getId())){
				while(i<students.length){
				students[i]=students[i+1];	
					
				}
				break;
				
			}
			
		}
	}

	@Override
	public void removeFromIndex(int index) {
		if(index==0||index>=students.length)
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		
		int i;
		for(i=index;i<students.length;i++){
			students[i]=null;
			
		}
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null){
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		}
		
		int i=0;
		for(i=0;i<students.length;i++){
			if(student.getId()==(students[i].getId())){
				while(i<students.length){
				students[i]=null;	
					i++;
				}
				break;
				
			}
			
		}
	}

	@Override
	public void removeToIndex(int index) {
		if(index==0||index>=students.length)
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		
		int i=0;
       for(i=0;i<=index;i++)
       {
    	   students[i]=null;
    	   
       }
	
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null){
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		}
		
		int i=0;
		for(i=0;i<students.length;i++)
		{
			if(student.getId()==(students[i].getId())){
				
				break;
			}
			students[i]=null;
		}
	}
    Student temp;  

	@Override
	public void bubbleSort() {  
         for(int i=0; i < students.length; i++){  
                 for(int j=1; j < (students.length-i); j++){  
                          if(students[j-1].getId() > students[j].getId()){  
                                 //swap elements  
                                 temp = students[j-1];  
                                 students[j-1] = students[j];  
                                 students[j] = temp;  
                         }  
                          
                 }  
         }  	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
		
		int i;
		Student stu[]=new Student[20];int j=0;
         for(i=0;i<students.length;i++)
         {
        	 if(students[i].getBirthDate().equals(date))
        	 {
        		 stu[j]=students[i];
        		 j++;
        	 }
        	 
         }
		return stu;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		int i;
		Student stu[]=new Student[20];int j=0;
         for(i=0;i<students.length;i++)
         {
        	 if(students[i].getBirthDate().before(date))
        	 {
        		 stu[j]=students[i];
        		 j++;
        	 }
        	 
         }
		return stu;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		
		Date date=new Date();
		int year1=date.getYear();
		int year2=students[indexOfStudent].getBirthDate().getYear();
		int mon1=date.getMonth();
		int mon2=students[indexOfStudent].getBirthDate().getMonth();
int date1=date.getDate();
int date2=students[indexOfStudent].getBirthDate().getDate();
      if(mon1>mon2)
    	  if(day1>=day2)
		return year2-year1;
      
     return year2-year1-1; 
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		int i;
		Student stu[]=new Student[20];int j=0;
         for(i=0;i<students.length;i++)
         {
        	 if(getCurrentAgeByDate(i)==age)
        	 {
        		 stu[j]=students[i];
        		 j++;
        	 }
        	 
         }
		return stu;
		
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		if(student==null){
			try {
			    throw new IllegalArgumentException("Threw an IllegalArgumentException");
			} catch(IllegalArgumentException e) {
			    System.out.println("Caught an IllegalArgumentException..." + e.getMessage());
			}
		}
		
		int i,j=0;double max=0;Student stu[]=new Student[20];
		for(i=0;i<students.length;i++){
			if(max>students[i].getAvgMark())
				{
				max=students[i].getAvgMark();
				}
				}
		for(i=0;i<students.length;i++){
			if(students[i].getAvgMark()==max)
				{stu[j]=students[i];
				j++;}
				}
			
return stu;
	}

	@Override
	public Student getNextStudent(Student student) {
		int i=0;
		for(i=0;i<students.length;i++){
			if(student.getId()==(students[i].getId())){
				
				break;
				
			}
			
		}
		return students[i+1];
	}
}
