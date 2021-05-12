package qhy.example.cache;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import qhy.example.bean.dictionary.DictionaryEntity;
import qhy.example.bean.job.JobBean;
import qhy.example.service.modules.job.service.JobService;
import qhy.example.service.modules.service.dictionary.DictionaryService;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@SpringBootTest
class CacheApplicationTests {
//	@Autowired
//	JobService jobService;

	@Autowired
	DictionaryService dictionaryService;

//	@Autowired
//	RedisTemplate redisTemplate;

	@Test
	void contextLoads() throws Exception{
//		redisTemplate.opsForValue().set("A","测试存储字符串");
//		Object a = redisTemplate.opsForValue().get("A");
//		List<Map> sum = jobService.getSum();
////		Float sum1 = Float.valueOf((String) sum.get(0).get("sum"));
//		System.out.println(sum);
//		JobBean jobBean = new JobBean();
//		String s = UUID.randomUUID().toString().replaceAll("-", "");
//		System.out.println(s);
//		jobBean.setDataId(s);
//		jobBean.setBeanName("测试");
//		jobService.save(jobBean);

//		List<DictionaryEntity> list = dictionaryService.list();
		List<DictionaryEntity> dictionary_code = dictionaryService.list(new QueryWrapper<DictionaryEntity>().isNull("parent_code"));
		dictionary_code.forEach((item) -> {
			try {
				System.out.println(new ObjectMapper().writeValueAsString(item));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
		List<String> collect = null;
		while (!dictionary_code.isEmpty()){
			collect = dictionary_code.stream().map((item) -> {
				return "" + item.getDictionaryCode() + "";
			}).collect(Collectors.toList());
			try {
				dictionary_code = dictionaryService.list(new QueryWrapper<DictionaryEntity>().in("parent_code", collect));

			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("---------------------- 数据库异常");
				break;
			}
			System.out.println(new ObjectMapper().writeValueAsString(dictionary_code));
		}

	System.out.println(new ObjectMapper().writeValueAsString(dictionary_code) + "你好呀！！！");
	}



}
