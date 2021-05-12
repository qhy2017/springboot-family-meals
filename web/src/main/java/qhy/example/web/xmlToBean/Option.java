package qhy.example.web.xmlToBean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@XStreamAlias("option")
public class Option implements Serializable {
    private static final long serialVersionUID = -1890486412852428329L;

    @XStreamAlias("name")
    private String name;
}
