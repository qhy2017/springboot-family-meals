package qhy.example.bean;

import qhy.example.bean.user.User;
import qhy.example.bean.validatoe.group.AddGroup;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.Set;

/**
 * @auth qhy
 * @email 1242359237@qq.com
 * @date
 */
public class TEst {
    public static void main(String[] args) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
//        ValidatorFactory validatorFactory = Validation.byDefaultProvider().configure().buildValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        User user = new User();
//        user.setDataId("abe");
        user.setUsername("渠红元元");
        user.setAge(29);
        Set<ConstraintViolation<Object>> validate = validator.validate(user, AddGroup.class);
        System.out.println(validate.size());
        StringBuilder sb = new StringBuilder();
        Iterator<ConstraintViolation<Object>> iterator = validate.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getMessage());
        }


//        for(ConstraintViolation<Object> obj : validate){
//            System.out.println(obj.getMessage());
//            sb.append(obj.getMessage().concat("-"));
//        }
        System.out.println(sb.toString());
        System.out.println("你好，世界因为有你而精彩，加油！！！");
        System.out.println("你好呀！！！ 哈哈哈哈哈。哈哈哈。");
    }
}
