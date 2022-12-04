//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            //printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         //Step 1: get the length
         int len = getLength(head);
         // Step 2: get the middle index
         int mid = len/2;
         //Step 3: get the middle node data
         Node curr = head;
         int elem = -1;
         for(int i = 0;i<=mid;i++){
             elem = curr.data;
             curr = curr.next;
         }
         return elem;
    }
    int getLength(Node head){ // find the length
        Node curr = head;
        int len = 0;
        while(curr!=null){
            curr = curr.next;
            len++;
        }
        return len;
    }
}
