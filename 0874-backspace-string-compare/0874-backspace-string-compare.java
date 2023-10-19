class Solution {
    public boolean backspaceCompare(String s, String t) {
        return processString(s).equals(processString(t));
    }

    private String processString(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
