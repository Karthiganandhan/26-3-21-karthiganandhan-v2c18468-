package secweek;

import java.util.*; 
class stud{ 
    
    private int marks; 
    private String name;
    private String grade;
	Status status;
    
    public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	enum Status 
    { 
        pending,approve,waiting //same order
         }
    
	public stud(int marks, String name, String grade,Status status)
	{
		super();
		this.marks = marks;
		this.name = name;
		this.grade = grade;
		this.status=status;
	}
	public String getName()  
    { 
        return name; 
    } 
    public void setName(String name) 
    { 
        this.name= name; 
    } 
      
    public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
    public int getMarks()  
    { 
        return marks; 
    } 
      
}
class myMarksComparator implements Comparator<stud> 
{ 
    
    public int compare(stud s1, stud s2)  
    { 
    	int s= s1.getMarks()-s2.getMarks();
    	System.out.println("vals behind fun___"+s1.getMarks()+"_____ "+s2.getMarks()+"___"+s); 
       return s;
        
    } 
} 
  

class Treeex { 
  
    public static void main (String[] args){ 
          
       TreeSet<stud> set = new TreeSet<stud>(new myMarksComparator()); 

    set.add(new stud(450,"surya",null,stud.Status.approve)); 
        set.add(new stud(341,"karthi",null,stud.Status.pending)); 
        set.add(new stud(347,"karthi","F",stud.Status.approve)); 
        set.add(new stud(590,"nandha","S",stud.Status.waiting)); 
        
        System.out.println("increasing Order with the Marks"); 
        for(stud ele: set) 
        { 
            System.out.print(ele.getName()+" "+ele.getMarks()+" "+ele.getGrade()+" "+ele.getStatus()); 
            System.out.println(); 
        } 
          
          
        
  
    } 
} 