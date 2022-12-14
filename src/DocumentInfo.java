import lombok.Getter;
import lombok.Setter;

import java.io.BufferedWriter;

@Getter
@Setter
public class DocumentInfo {
    private String address;
    private String tag;
    private int limit;
    private BufferedWriter writer;
    private int aux;

    public DocumentInfo(String address, String tag, BufferedWriter writer, int aux) {
        this.address = address;
        this.tag = tag;
        this.writer = writer;
        this.aux = aux;
    }

}
