class Solution:
    def convertToMinutes(self, time: str) -> int:
        hours, minutes = map(int, time.split(":"))
        return hours * 60 + minutes

    def findMinDifference(self, timePoints: List[str]) -> int:
        minutes = []
        for time in timePoints:
            minutes.append(self.convertToMinutes(time))
        
        minutes.sort()
        # Add first time point + 1440 for circular time comparison
        minutes.append(minutes[0] + 1440)
        
        min_diff = float('inf')
        for i in range(1, len(minutes)):
            min_diff = min(min_diff, minutes[i] - minutes[i - 1])
        
        return min_diff