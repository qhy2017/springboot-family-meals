package qhy.example;

import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.junit.Test;
import qhy.example.bean.student.Student;
import qhy.example.bean.user.User;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static ValidatorFactory validatorFactory;

    private static Validator validator;

    /**
     * 静态语句快
     */
    static {
        if (validatorFactory == null) {
            validatorFactory = Validation.buildDefaultValidatorFactory();
            getValidator(validatorFactory);
        } else {
            System.out.println("ValidatorFactory 不等于空");
        }
    }

    static void getValidator(ValidatorFactory validatorFactory){
        validator = validatorFactory.getValidator();
    }

    /**
     * Rigorous Test :-)
     */
//    @Test
    public void shouldAnswerWithTrue() {
//        assertTrue( true );
        Object user = new User();
        Set<ConstraintViolation<Object>> validate = validator.validate(user);
        String message = validate.iterator().next().getMessage();
        System.out.println(message);

    }
    @Test
    public void jackBeanTest() throws Exception{

        ObjectMapper objectMapper = new ObjectMapper();
//		Student student = new Student();
//		student.setName("哈哈");
//		objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
//		String s = objectMapper.writeValueAsString(student);
//		log.info(s);
        Map<String,Object> map = new HashMap<>();
        map.put("name","我的");
        map.put("id", UUID.randomUUID().toString());
        map.put("date","2018-09-12 12:12:01");
        String s = objectMapper.writeValueAsString(map);
        Student bean = objectMapper.readValue(s,Student.class);
        System.out.println(objectMapper.writeValueAsString(bean));


    }
}
