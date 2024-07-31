// Compute XOR from 1 to n (direct method)

class A{
    public static void main(String[] args){
        int n = 6;
        //Scanner a = new Scanner(System.in);
        if(n%4 == 0){
            System.out.println(n);
        }
        else if(n%4 ==1){
            System.out.println(1);
        }
        else if(n%4 ==2){
            System.out.println(n+1);
        }
        else {
            System.out.println(0);
        }
    }
}