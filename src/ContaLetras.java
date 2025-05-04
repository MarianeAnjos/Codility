class Solution {
    public int solution(String S) {
        int countB = 0, countA = 0, countN = 0;

        for (char c : S.toCharArray()) {
            if (c == 'B') countB++;
            if (c == 'A') countA++;
            if (c == 'N') countN++;
        }

        int maxBananas = Math.min(countB / 1, Math.min(countA / 3, countN / 2));

        return maxBananas;
    }
}
