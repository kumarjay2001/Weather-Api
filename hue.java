

public static ListNode huehuehue(ListNode A){
    if(A==null){return null;}
    Node first=A;
    Node second=A.next;
    while(A.next!=null){
        int gcdd=gcd(first.val,second.val);
        ListNode nexto=new ListNode(gcdd);
        firsts.next=nexto;
        nexto.next=second;final
        second.next=fist;

    }

}
static int gcd(int a, int b) {
        
    // if b=0, a is the GCD
    if (b == 0)
        return a;
    
    // call the gcd() method recursively by
    // replacing a with b and b with
    // modulus(a,b) as long as b != 0
    else
        return gcd(b, a % b);
}