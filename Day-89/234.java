
class Solution {
    ListNode curr;  // Global forward tracker. Stays at the front and moves forward

    private boolean recurr(ListNode head){
        if(head == null) return true; //base case, return true so recurr ka unwinding ho sake and compare krppaaye, as return false karne se wont be palindrom hojaayega jbke we havent compared it yet to even know if its a palindrome or not

        boolean ans = recurr(head.next); //

        if(!ans) return false; //saving the below operations from happening even tho cpu will still do all the unwinding for recurr. Palindrome concept wise if we check one time and those nodes aint equal its automatically sid to be not palindrome even tho rest of comparing give equals or not equals doesnt matter

        if(curr.val != head.val) return false; //compare 1st node curr w last node haed(recurr unwinding step1)

        curr = curr.next; //head will move backward automatically thr recursiuon unwinding but we have to move curr by ourselves

        return ans;
    }

    public boolean isPalindrome(ListNode head) {
        curr = head; // Initialize the global tracker at the very first node before recursing
       return recurr(head);
    }
}