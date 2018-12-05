/*
Name: Adam Carling
Date: 11/6/18
Description: Program sorts a list of geometric objects and returns the areas in a sorted list. Program can be modified to use the to string method found in the circle class to show the user what each object is. It would also mean the program would only have to call the list and not, "List[i].getArea();"
*/
import java.util.Comparator;
class GeoSort {
	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
		boolean isSorted = false;
		
		
		for (int i = 0; i < list.length - 1; i++){
			int minIndex = i;
			
			for( int j = i +1; j < list.length; j++){
				if (comparator.compare(list[j], list[minIndex]) == -1 ){
					minIndex = j;			
			}
		}
		E temp = list[minIndex];
		list[minIndex] = list[i];
		list[i] = temp;
		}		
	}

	
	
	
	public static void main(String[] args) {
		
		GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
			new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
			new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
			new Circle(6.5), new Rectangle(4, 5)};
		
	selectionSort(list, new GeometricObjectComparator());
		
		for(int i = 0; i < list.length; i++){
			System.out.println(list[i].getArea());
		}
		
		GeometricObject[] sortedList = {};
	}
}