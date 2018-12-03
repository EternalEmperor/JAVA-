import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static Object FileInputStream;

    public static List<String> readFile(String path) throws IOException {
        List<String> content = new ArrayList<String>();

        InputStream fio = new FileInputStream(path);
        BufferedReader bfi = new BufferedReader(new InputStreamReader(fio));

        String line = null;
        while(true){
            if(bfi.readLine() != null){
                content.add(line);

            }else
                break;
        }
        return content;
    }

    public static boolean writeFile(String filePath, List<String> content, boolean append) throws IOException {
        boolean success = false;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath, append);
            for(String cot : content){
                byte[] byteContent = cot.getBytes();
                fos.write(byteContent);
            }

            success = true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
          fos.close();
        }
        return success;
    }

    public static String getFullPath(String serverPath,String filename){
        return serverPath + "\\" + filename;
    }
}
