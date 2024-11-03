/* Link - https://www.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1 */

class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int count = 0;
        if(head == null) return true;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(count % 2 == 0) return true;
        else return false;
    }
}