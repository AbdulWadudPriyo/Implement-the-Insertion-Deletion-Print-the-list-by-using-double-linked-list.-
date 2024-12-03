package LinkListOperations;
public class Main {
public static void main(String[] args) { 
LinkListOperations list=new LinkListOperations();
list.insertAtFirst(); 
list.insertAtFirst(); 
list.insertAtFirst(); 
list.insertAtFirst();

System.out.println("\nAfter inserting at Fast:"); 
list.printList();
list.insertAtLast();
System.out.println("\nAfter inserting at last:"); 
list.printList();
list.insertAtMiddle();
System.out.println("\nAfter inserting at middle:"); 
list.printList();
list.deleteFirst();
System.out.println("\nAfter deleting fast node:"); 
list.printList();
list.deleteLast();
System.out.println("\nAfter deleting last node:"); 
list.printList();
list.deleteMiddle();
System.out.println("\nAfter deleting middle node:");
 
list.printList();
}
}
