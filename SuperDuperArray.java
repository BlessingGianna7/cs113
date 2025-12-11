public class SuperDuperArray implements SuperArray{
	
	private String[] list;
	private int size;

	public SuperDuperArray(int capacity){
		this.list = new String[capacity];
		this.size = 0;
	}


	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

   public void add(String element){
		list[size] = element;
		size++;
	}

   public boolean remove(String element){
		for(int i = 0; i < size; i++){
			if(list[i].equals(element)){
				for (int j = i; j < size - 1; j++) {
					list[j] = list[j + 1];
				}
				size--;
				return true;
			}
		}
		return false;
	}

    public void clear(){
		for (int i = 0; i < size; i++){
			list[i] = null;
			size = 0;
		}
	}

	 public boolean contains(String element){
		for( int i = 0; i < size; i++){
			if(list[i].equals(element)){
				return true;
			}
		}
		return false;
	}

    public String toString(){
		String res = "";
		for(int i = 0; i < size; i++){
			res = res + " " + list[i];
		}
		return res;
	}

	public int indexLowest(String[] list, int low, int high) {
      int lowestIndex = low;
      for (int i = low + 1; i <= high; i++) {
        if (list[i].compareTo(list[lowestIndex]) < 0) {
            lowestIndex = i;
        }
    	}
    	return lowestIndex;
   }
	
	public int indexHighest(String[] list, int low, int high) {
	   int highestIndex = low;
  	   for (int i = low + 1; i <= high; i++) {
        if (list[i].compareTo(list[highestIndex]) > 0) {
            highestIndex = i;
        }
    	}
    	return highestIndex;
	}
	
	public void swap(String[] list, int i, int j) {
    	String temp = list[i];
    	list[i] = list[j];
    	list[j] = temp;
	}
	
	public String[] sort(int order) {
   
    	String[] sorted = new String[size];
    	for (int i = 0; i < size; i++) {
      	  sorted[i] = list[i];
    	}	
    
    
   	 for (int i = 0; i < size - 1; i++) {
      	  if (order == 1) { 
         	   int lowestIndex = indexLowest(sorted, i, size - 1);
            	swap(sorted, i, lowestIndex);
        	  } else {
   	         int highestIndex = indexHighest(sorted, i, size - 1);
      	      swap(sorted, i, highestIndex);
        	  }
    	  }
    	  return sorted;
   }

	public static void main(String[] args){
		SuperDuperArray arr = new SuperDuperArray(4);
		System.out.println("Is empty? " + arr.isEmpty());
		arr.add("bryn");
      arr.add("mawr");
      arr.add("college");
      arr.add("haveford");
      arr.add("swarthmore");
      System.out.println("Array is: " + arr.toString());
      System.out.println("Size is: " + arr.size());
		System.out.println("Contains 'college'? " + arr.contains("college"));		
	}	




}
