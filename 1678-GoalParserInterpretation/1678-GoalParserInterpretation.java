// Last updated: 9/25/2026, 2:35:54 PM
class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
