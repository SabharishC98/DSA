// Last updated: 3/24/2026, 11:23:57 AM
class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
