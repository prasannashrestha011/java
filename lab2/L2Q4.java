//WAP to display the given star/number series.
public class L2Q4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            StringBuilder line = new StringBuilder();

            // Left stars: i stars (max 5), pad to width 5
            for (int j = 1; j <= i; j++) {
                line.append("*");
            }
            for (int j = i; j < 5; j++) {
                line.append(" "); // pad so column width = 5
            }
            line.append("  "); // fixed gap

            // Middle stars: 5 - 2*(i-1), pad to width 5
            int stars = 5 - 2 * (i - 1);
            if (stars > 0) {
                for (int j = 0; j < stars; j++) {
                    line.append("*");
                }
                for (int j = stars; j < 5; j++) {
                    line.append(" "); // pad remaining
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    line.append(" "); // full pad when no stars
                }
            }
            line.append("  "); // fixed gap

            // Right numbers: 1 to (6-i)
            for (int j = 1; j <= 6 - i; j++) {
                line.append(j);
            }

            System.out.println(line);
        }
    }
}