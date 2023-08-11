package Collections.List;

import java.util.*;

    // For integer datatype
public class Arraylist {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrayList size: ");
        int size = sc.nextInt();

        // Creating a object for arraylist class with a generic 
        List<Integer> list = new ArrayList<Integer>();
        
        // Adding the elements to the list using "listname.add(elements)" method
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        // The another way to add 
            list.add(10);
            list.add(20);
            list.add(01);
        
        System.out.println("List after adding the elements : ");
        System.out.println(list);

        System.out.println();
        // Removing the element in the list using "listname.remove(index)" method
            list.remove(1);
            list.remove(2);
            
        System.out.println("After removing 1 and 2 index in the list : ");
        System.out.println(list);

        System.out.println();
        // Geting the elements form the list using "listname.get(index)" method
        System.out.println("This elements are got by the get() method : ");
            System.out.println(list.get(1));
            System.out.println(list.get(5));

        System.out.println();
        // Retrive the data form the list using "listname.indexOf(element)" method
        System.out.println("The index of 10 in the list is : ");
            System.out.println(list.indexOf(10));

        System.out.println();
        // Retriving the last occrance of the element in the list by using "listname.lastIndexOf(element)" method
        System.out.println("The last occrance of the enetered number is : ");
            System.out.println(list.lastIndexOf(1));
        
        System.out.println();
        // Adding/Coping the all elements to the new arraylist 
        // Before coping/adding the elements creating the new object for arraylist
        List<Integer> anotherList = new ArrayList<Integer>();   

        // To check the the list is empty 
        System.out.println("If the list is empty it return "+true+" else "+false+" :");
            System.out.println(anotherList.isEmpty());

        System.out.println();
        // To copy the list to another list
            anotherList.addAll(list);
        System.out.println("The new list : ");
        System.out.println(anotherList);

        System.out.println();
        // Update (or) replace the element in the list use the "listname.set(index,value)" method
            anotherList.set(1,100);
        System.out.println("The list after replacing the element : ");
        System.out.println(anotherList); 

        // To clear/delete all the elements in the list use "listname.clear()" method
            anotherList.clear();

        System.out.println();
        // To get the size of the list use "listname.size()" method
        System.out.println("The size of the list is: ");
            list.size();
            System.out.println(list.size());
       }
}
 