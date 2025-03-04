class palindrome {
    public static void main(String []args){
        int n=545;
        int k=n;
        palindrome(n,k);
    }
    public static void palindrome(int n,int k){
        int rev=0;
        while(n!=0){
           int rem= k%10;
           rev=rev*10+rem;
           k=k/10;
        }
if(n==rev){
    System.out.print("palindrome");
}else{
    System.out.print("not a palindrome");
}
    }
}