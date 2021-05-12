package qhy.example.web.xmlToBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@XStreamAlias("Xml")
public class BeanXml implements Serializable {
    private static final long serialVersionUID = -7876249650095873158L;

    @XStreamAlias("name")
    private String name;


    @XStreamAlias("options")
    List<Option> options;



}
