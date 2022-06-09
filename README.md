# java_valid_anagram

Given two strings `s` and `t`, return `true` *if* `t` *is an anagram of* `s`*, and* `false` *otherwise*.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

## Examples

**Example 1:**

```
Input: s = "anagram", t = "nagaram"
Output: true

```

**Example 2:**

```
Input: s = "rat", t = "car"
Output: false

```

**Constraints:**

- `1 <= s.length, t.length <= $5*10^4$`
- `s` and `t` consist of lowercase English letters.

## 解析

給定兩個字串 s, t

要求實作一個演算法 判斷 s 是不是 t 的 anagram

s 如果是 t 的 anagram 需要符合以下條件

1. s, t 的字串長度相同
2. s, t 相同的字元個數相同

所以只要先檢查

s,t 長度是否相同

因為 s,t 是由 ‘a’-’z’

所以可以透過 長度 26 的整數陣列來儲存個數

所以 每個字元 ch - ‘a’ 是介於 0 - 25

然後對每個累計遇到的字元

遇到 s_c - ‘a’ 則加一

遇到 t_c - ‘a’ 則減一

時間複雜度是 O(n)

## 程式碼
```java
public class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen= s.length();
        int tLen = t.length();
        if (sLen != tLen) {
            return false;
        }
        int[] freq = new int[26];
        for (int idx = 0; idx < sLen; idx++) {
            char s_c = s.charAt(idx);
            char t_c = t.charAt(idx);
            int s_diff = s_c - 'a';
            int t_diff = t_c - 'a';
            freq[s_diff]++;
            freq[t_diff]--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

```
## 困難點

1. 理解 anagram 特性
2. 運用 Hashtable 加快找尋

## Solve Point

- [x]  Understand what problem to solve
- [x]  Analysis Complexity