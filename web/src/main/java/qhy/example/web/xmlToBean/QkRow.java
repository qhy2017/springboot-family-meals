package qhy.example.web.xmlToBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;

@Data
@XStreamAlias("Row")
public class QkRow {

    @XStreamAlias("Apnum")
    private String apnum;

    @XStreamAlias("Header")
    private QkHeader header;

    @XStreamAlias("Items")
    private List<QkItem> Items;
}
