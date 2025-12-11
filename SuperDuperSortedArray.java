public class SuperDuperSortedArray implements SuperArray{
	
	private String[] list;
	private int size;
	
	public SuperDuperSortedArray(int capacity) {
		this.list = new String[capacity];
		this.size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			list[i] = null;
		}
		size = 0;
	}

	public boolean contains(String element) {
		if(binarySearch(element) == -1){
			return false;
		} else {
			return true;
		}
	}

	public int binarySearchHelper(String value, int l, int r){
	
		if(l > r) {
            return -1;
        } else {
            int mid = (r - l) / 2 + l; 
            if((value.compareTo(list[mid])) < 0) {
                return binarySearchHelper(value, l, mid - 1);
            } else if((value.compareTo(list[mid] )) > 0) {
                return binarySearchHelper(value, mid + 1, r);
            } else {
                return mid;
            }
        }
	}

	private int binarySearch(String value){ 
		return binarySearchHelper(value, 0, size - 1);
	}

	public boolean remove(String element){
		int index = binarySearch(element);
		if (index == -1) {
			return false;
		}
		for (int i = index; i < size - 1; i++) {
			list[i] = list[i + 1];
		}
		size--;
		return true;
	}
	
	public void add(String element){
		int insert = size;
		for (int i = 0; i < size; i++) {
			if (element.compareTo(list[i]) < 0) {
				insert = i;
				break;
			}
		}
		for (int i = size; i > insert; i--) {
			list[i] = list[i - 1];
		}
		list[insert] = element;
		size++;
 
	}
	public String toString(){
		String res = "";
		for(int i = 0; i < size; i++){
			res = res + " " + list[i];
		}
		return res;
	}

}
