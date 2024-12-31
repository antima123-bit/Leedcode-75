class Solution:
    def mincostTickets(self, days: List[int], costs: List[int]) -> int:
        tickets: List[int] = [1, 7, 30]

        @cache
        def next_idx(curr: int, tick: int = 0) -> int:
            for i in range(curr, -1, -1):
                if days[i] <= days[curr] - tick:
                    return i

            return -1

        @cache
        def dp(i: int) -> int:
            if i < 0:
                return 0
            elif i == 0:
                return min(costs)
            return min(c + dp(next_idx(i, tickets[j])) for j, c in enumerate(costs))

        return dp(len(days) - 1)    