public class Instructor{
	public int officeNumber;
	public String name;
	public String officeBuilding;
	public Instructor(String name, String officeBuilding, int officeNumber){
		this.name = name;
		this.officeBuilding = officeBuilding;
		this.officeNumber = officeNumber;
	}	
	public String getName(){
  	   return  this.name;
	}
    public int getOfficeNumber(){
		return  this.officeNumber;
    }
	public String getOfficeBuilding(){
		return this.officeBuilding;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setOfficeBuilding(String officeBuilding){
		this.officeBuilding = officeBuilding;
	}
	public void setOfficeNumber(int officeNumber){
		this.officeNumber = officeNumber;
	}
	public String toString(){
		return  "The  name is: " + this.name + "and the office building is :" +this.officeBuilding + "and the officeNumber is :" + this.officeNumber;
	}  
	public boolean equals(Instructor i2){
		if(this.name.equals(i2.name) && this.officeBuilding.equals(i2.officeBuilding) && this.officeNumber == i2.officeNumber){
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args){
		Instructor i1 = new Instructor("Dr.Blessing", "Park", 300);
		System.out.println("Instructor name: " + i1.getName());
		System.out.println("Instructor building: " + i1.getOfficeBuilding());
		System.out.println("Instructor office number: " + i1.getOfficeNumber());
		i1.setName("Dr. Smith Jr.");
		i1.setOfficeBuilding("New Science Hall");
		i1.setOfficeNumber(206);
		System.out.println(i1.toString());
		Instructor i2 = new Instructor("Dr.Gianna", "Dalton", 200);
		System.out.println("i1 and i2 equal is " + i1.equals(i2));
	}





}
