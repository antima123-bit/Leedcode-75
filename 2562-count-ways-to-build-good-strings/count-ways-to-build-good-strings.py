class Solution:
    def countGoodStrings(self, low: int, high: int, zero: int, one: int) -> int:
        @lru_cache(None)
        def solve(length):
            if length==0:
                return 1 
            if length<0:
                return 0
            zeroCount= solve(length- zero)
            oneCount = solve(length - one)
            return(oneCount + zeroCount) % mod   


        ans= 0 
        mod = (10**9)+7
        for length in range(low, high+1):
            ans = (ans+solve(length))%mod
        return ans