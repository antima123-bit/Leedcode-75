# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        stack1 = []
        stack2 = []

        # Fill the stacks with the nodes of the linked lists
        while l1:
            stack1.append(l1)
            l1 = l1.next
        while l2:
            stack2.append(l2)
            l2 = l2.next

        head = None
        carry = 0

        # Process the stacks until both are empty and no carry remains
        while carry or stack1 or stack2:
            if stack1:
                carry += stack1.pop().val  # Get value from l1
            if stack2:
                carry += stack2.pop().val  # Get value from l2
            
            # Create a new node for the current digit
            node = ListNode(carry % 10)
            node.next = head
            head = node
            
            carry //= 10  # Update carry for the next iteration

        return head
