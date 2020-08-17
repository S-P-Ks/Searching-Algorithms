class JumpSearch {

    public int Jump(int[] a,int num){
        int n = a.length;
        if(n >= 0){
            int step = (int)Math.floor(Math.sqrt(n));
            int prev = 0;
            while(a[Math.min(step,n) - 1] < num){
                prev = step;
                step += (int)Math.floor(Math.sqrt(n));
                if(prev >= n){
                    return -1;
                }
            }
            
            while(a[prev] < num){
                prev++;
            }
            if(a[prev] == num){
                return prev;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        JumpSearch j = new JumpSearch();
        int[] a = new int[]{ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int num = 8;
        int ans = j.Jump(a,num);
        if(ans >= 0){
            System.out.println("Element found at " + ans);
        }else{
            System.out.println(ans);
            System.out.println("Element not Found... Abe saale barabar input dalna **$$$**");
        }
    }
}