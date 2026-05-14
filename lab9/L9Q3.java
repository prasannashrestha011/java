import java.io.*;

public class L9Q3 {
    public static void main(String[] args) throws Exception {
        File src = new File("university.txt");
        File dest = new File("college.txt");
        if (!src.exists()) {
            System.out.println("university.txt not found");
            return;
        }
        try (FileInputStream in = new FileInputStream(src);
                FileOutputStream out = new FileOutputStream(dest)) {
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
        }
        System.out.println("Copied to college.txt");
    }
}
