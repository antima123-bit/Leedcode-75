class Solution(object):
    def compress(self, chars):
        """
        Compresses the input character array in-place following the specified algorithm.

        Args:
            chars (List[str]): The input character array.

        Returns:
            int: The new length of the compressed array.
        """
        i = 0  # Pointer for the modified chars array
        counter = 1  # Counter for the current group

        for j in range(1, len(chars) + 1):
            if j < len(chars) and chars[j] == chars[j - 1]:
                counter += 1
            else:
                chars[i] = chars[j - 1]  # Store the character in the modified chars array
                i += 1
                if counter > 1:
                    for digit in str(counter):
                        chars[i] = digit  # Store each digit of the counter
                        i += 1
                counter = 1  # Reset the counter for the next group

        return i  # Return the new length of the compressed array

