import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class walker {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter path: ");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String path = buffer.readLine();
        File directory = new File(path);
        walk(directory, 1);
    }

    public static void walk(File directory, Integer depth) {
        if (!directory.isDirectory()) {
            System.out.print("-".repeat(depth) + directory.getName());
        } else {
            for (File file : directory.listFiles()) {
                if (file.isFile()) {
                    System.out.println("-".repeat(depth) + file.getName());
                } else {
                    System.out.println("-".repeat(depth) + file.getName());
                    walk(file, depth + 1);
                }
            }
        }
        return;
    }
}

