package qhy.example.web.xmlToBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("DATA")
public class DataXml {

    @XStreamAlias("Row")
     private QkRow row;

}
