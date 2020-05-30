package qhy.example.bean.student;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import qhy.example.bean.filter.bean.StringToDateFilter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
/**
 * 属性名称排序
 */
@JsonPropertyOrder({"dataId","name","age"})
public class Student implements Serializable {
    private static final long serialVersionUID = -955460072446130587L;
    @JsonIgnore
    private String dataId;
    @JsonIgnore
    private String name;
//
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private String sex;

    @JsonIgnore
    private Integer age;
//
//    private String remark;
    /**
     * 日期字符串转日期
     */
    @JsonDeserialize(using = StringToDateFilter.class,as = Date.class,contentAs = String.class)
    private Date date;

    private Map<String, String> properties = new HashMap<>();

    @JsonAnySetter
    public void setProperties(String key, String value) {
        this.properties.put(key, value);
    }
    @JsonAnyGetter
    public Map<String, String> getProperties(){
        return this.properties;
    }
}
