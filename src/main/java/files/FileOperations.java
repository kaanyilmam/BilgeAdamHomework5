package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperations implements IReadWriteOperations{
    private String fileName;

    public FileOperations(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<String> read() {
        List<String> resultList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.equals("")){
                    resultList.add(line);
                }
            }
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
        return resultList;
    }

    @Override
    public void write(String txt) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(txt);
            writer.close();
        } catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }

}
