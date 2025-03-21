# Merge Strings Alternately
You are given a 0-indexed string array words.  
Two strings are similar if they consist of the same characters.

For example, `"abca"` and `"cba"` are similar since both consist of characters `'a'`, `'b'`, and `'c'`.
However, `"abacba"` and `"bcfd"` are not similar since they do not consist of the same characters.
Return the number of pairs `(i, j)` such that 0 <= i < j <= `word.length - 1` and the two strings `words[i]` and `words[j]` are similar.

### Example 1:  
Input: words = `["aba","aabb","abcd","bac","aabc"]`  
Output: `2`  
Explanation: There are 2 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
- i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'. 
 
### Example 2:  
Input: words = `["aabb","ab","ba"]`  
Output: `3`  
Explanation: There are 3 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
- i = 0 and j = 2 : both words[0] and words[2] only consist of characters 'a' and 'b'.
- i = 1 and j = 2 : both words[1] and words[2] only consist of characters 'a' and 'b'.

### Example 3:
Input: words = `["nba","cba","dba"]`  
Output: `0`  
Explanation: Since there does not exist any pair that satisfies the conditions, we return 0.

### Constraints:
1 <= `words.length` <= 100  
1 <= `words[i].length` <= 100  
`words[i]` consist of only lowercase English letters.

---

You are given two strings `word1` and ~~word2~~. Merge the strings by adding letters in alternating order, starting with `word1`. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

### Example 1:
Input: word1 = `"abc"`, word2 = `"pqr"`  
Output: `"apbqcr"`  
Explanation: The merged string will be merged as so:  
word1: `a____b___c`  
word2: `___p___q___r`  
merged: `a p b q c r`  

### Example 2:
Input: word1 = `"ab"`, word2 = `"pqrs"`  
Output: `"apbqrs"`  
Explanation: Notice that as `word2` is longer, `"rs"` is appended to the end.  
word1: `_a___b`  
word2: `__p___q_r_s`  
merged: `a p b q r s`  

### Example 3:
Input: word1 = `"abcd"`, word2 = `"pq"`  
Output: `"apbqcd"`  
Explanation: Notice that as `word1` is longer, `"cd"` is appended to the end.  
word1: `_a___b____c_d`  
word2: `___p___q`  
merged: `a p b q c d`


Constraints:

1 <= `word1.length`, `word2.length` <= 100
`word1` and `word2` consist of lowercase English letters.
