package qhy.example.bean.user;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import qhy.example.bean.validatoe.group.AddGroup;
import qhy.example.bean.validatoe.group.UpdateGroup;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class User implements Serializable {


    private static final long serialVersionUID = -4233518651802925839L;
    /**
     * 主键id
     */
    @NotBlank(message = "用户id 不能为空",groups = {AddGroup.class})
    @Length(max = 3,message = "用戶id长度在 0-3之间",groups = {AddGroup.class})
    private String dataId;
    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空",groups = {AddGroup.class})
    @Length(max = 3, message = "用戶名最大长度为3",groups = {AddGroup.class})
    private String username;

    private String password;

    private String slat;

    @DecimalMax(message = "最大年龄300岁", value = "300",groups = {AddGroup.class})
    @DecimalMin(message = "最小年龄30岁", value = "30",groups = {AddGroup.class})
    private Integer age;


}
