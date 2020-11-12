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
        if (!directory.isDirectory()){
            System.out.print("This is not directory!");
        }
        else {
            walk(directory, 1);
        }
    }

    public static void walk(File directory, Integer depth) {
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                System.out.println(" ".repeat(depth) + file.getName());
            } else {
                System.out.println(" ".repeat(depth) + file.getName());
                walk(file, depth + 1);
            }
        }
        return;
    }
}

