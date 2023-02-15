import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class AddNumbers{
	static String addStrings(String num1, String num2) {
        String big = num1.length() >= num2.length() ? num1 : num2;
        String small = num1.length() < num2.length() ? num1 : num2;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < big.length(); i++) {
            int b = big.charAt(big.length() - i - 1) - '0';
            int s = i < small.length() ? (small.charAt(small.length() - i - 1) - '0') : 0;
            sum += b + s;
            sb.append(sum % 10);
            sum /= 10;
        }
        if (sum > 0) sb.append(sum);
        return sb.reverse().toString();
    }
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "";
        String s2 = "";
        while(l1.next!= null){
            s1 += l1.val;
            l1 = l1.next;
        }
        s1 += l1.val;
        while(l2.next!=null)
        {
            s2 += l2.val;
            l2 = l2.next;
        }
        s2 += l2.val;
       
        String ss1 = "";
        String ss2 = "";
        for(int i=s1.length()-1; i>=0; i--){
            ss1 += s1.charAt(i);
        }
        for(int i = s2.length()-1;i>=0; i--){
            ss2 += s2.charAt(i);
        }
        
        String anss = addStrings(ss1, ss2);
        String ans ="";
        for(int i=anss.length()-1; i>=0; i--)
            ans += anss.charAt(i);
        ListNode prev = null;
        for(int i=0; i<anss.length(); i++){
            int temp = Integer.parseInt(anss.charAt(i)+""); 
            ListNode ln = new ListNode(temp, prev);
            prev = ln;
        }
        return prev;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter space separated digits in first no.: ");
		String s1 = sc.nextLine();
		System.out.print("Enter space separated digits in first no.: ");
		String s2 = sc.nextLine();
		String[] nums1 = s1.split(" ");
		String[] nums2 = s2.split(" ");
		int[] arr1 = new int[nums1.length];
		int[] arr2 = new int[nums2.length];
		for(int i=0; i<nums1.length; i++)
			arr1[i] = Integer.parseInt(nums1[i]);
		for(int i=0; i<nums2.length; i++)
			arr2[i] = Integer.parseInt(nums2[i]);
		
		ListNode h1 = new ListNode();
		ListNode temp = h1;
		
		for(int i=0; i<arr1.length; i++){
			temp.next = new ListNode();
			temp.next.val = arr1[i];
			temp = temp.next;
		}
		ListNode h2 = new ListNode();
		temp = h2;
		
		for(int i=0; i<arr2.length; i++){
			temp.next = new ListNode();
			temp.next.val = arr2[i];
			temp = temp.next;
		}
		ListNode ans = addTwoNumbers(h1.next, h2.next);
		System.out.println();
		while(ans != null){
			System.out.print(ans.val);
			ans = ans.next;
		}
			
	}
}