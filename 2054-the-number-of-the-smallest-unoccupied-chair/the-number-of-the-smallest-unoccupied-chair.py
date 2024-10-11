class Solution(object):
    def smallestChair(self, times, targetFriend):
        """
        :type times: List[List[int]]
        :type targetFriend: int
        :rtype: int
        """
        events = []
        for i, (arrival, leaving) in enumerate(times):
            events.append((arrival, 1, i))  # 1 indicates arrival
            events.append((leaving, 0, i))  # 0 indicates departure
    
    # Sort events based on time, then by type (departure before arrival if they are at the same time)
        events.sort()

    # Priority queues
        available_chairs = []  # Min-heap for available chairs
        occupied_chairs = {}   # Map to track which chair each friend is occupying
    
    # Initialize chair numbering
        next_chair = 0

        for time, event_type, friend in events:
            if event_type == 1:  # Arrival event
            # Get the smallest available chair or use the next available chair number
                if available_chairs:
                   chair = heapq.heappop(available_chairs)
                else:
                   chair = next_chair
                   next_chair += 1
            
            # Assign this chair to the current friend
                occupied_chairs[friend] = chair

            # If this is the target friend, return the chair number
                if friend == targetFriend:
                   return chair

            else:  # Departure event
            # Friend leaves, free up their chair
                chair = occupied_chairs.pop(friend)
                heapq.heappush(available_chairs, chair)
