package LinkListOperations;
import java.util.Scanner;
public class LinkListOperations {
Node start;
Node end;

public LinkListOperations(){ start=null;
end=null;
}

public Node getNode(){
Node newNode=new Node();
Scanner input=new Scanner(System.in); System.out.println("\nEnter data:"); newNode.data=input.nextInt(); newNode.next=null; newNode.prev=null;
return newNode;
}
public void insertAtFirst(){ Node newNode=getNode(); if(start==null){
start= newNode; end=newNode;
}
else{
newNode.next=start; start.prev=newNode; start=newNode;
}
}

public void insertAtLast(){ Node newNode=getNode(); if(end==null){
start=newNode; end=newNode;
}
else{
end.next = newNode; newNode.prev = end; end = newNode;
}
 
}
public void insertAtMiddle(){ Node newNode=getNode();
Scanner input=new Scanner(System.in); System.out.println("Enter the position:"); int position=input.nextInt();
if(position==1){ insertAtFirst();
}
else{

Node current = start;
int currPosition = 1;
while (current != null && currPosition < position) { current = current.next;
currPosition++;
}
if (current == null) { insertAtLast();
}
else {
newNode.next = current; newNode.prev = current.prev; current.prev.next = newNode; current.prev = newNode;
}
}

}

public void deleteFirst(){ if (start == null) { return;
}
if (start == end) { start = null; end = null;
return;
}
Node temp = start; start = start.next; start.prev = null; temp.next = null;
}
 
public void deleteLast(){
if (end == null) {
return;
}
if (start == end) { start = null; end = null;
return;
}
Node temp = end; end = end.prev; end.next = null; temp.prev = null;
}
public void deleteMiddle(){
Scanner input=new Scanner(System.in); System.out.println("Enter the position:");
int pos=input.nextInt();
if (start == null) {
return;
}
if (pos == 1) { deleteFirst(); return;
}
Node current =start;
int count = 1;
while (current != null && count != pos) { current = current.next;
count++;
}
if (current == null) { System.out.println("Position wrong"); return;
}
if (current == end) { deleteLast();
return;
}
current.prev.next = current.next; current.next.prev = current.prev; current.prev = null;
current.next = null;
}
public void printList(){
 
Node temp=start;
while(temp!=null){ System.out.print(temp.data+"-->"); temp=temp.next;
}
System.out.println("Null");
}
}
