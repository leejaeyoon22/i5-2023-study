class Solution {
    public int solution(int n) {
        int sum = 0;
        if(0<=n && n<= 3000){
            for(int i = 1; i <= n; i++) {
                if(n % i == 0)
                    sum = sum + i;
            }
        }
        return sum;
    }
}
