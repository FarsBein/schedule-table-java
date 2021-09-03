public class Schedule implements Table {
    String[] titles = {"Course Name","Course Code"};
    String[] content;

    public Schedule(String[] content) {
        this.content = content;
    }

    public String titles() {
        return ""; 
    }

    public String toString() {
        String res = "--------------------------------------------------------------\n";
        res += String.format("%-30s", titles[0]);
        // titles
        for (int i = 1; i < titles.length; i++) {
            res += String.format(" | %-30s", titles[i]);
            
        }
        res += "|\n--------------------------------------------------------------\n";
        // content
        for (int i = 0; i < content.length; i++) {
            res = res + content[i] + "|\n";
        }
        return res + "--------------------------------------------------------------";
    }
}
