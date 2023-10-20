package files;

import java.util.List;

public interface IReadWriteOperations {
    List<String> read();
    void write(String txt);

}
