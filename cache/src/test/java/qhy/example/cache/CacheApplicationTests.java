package qhy.example.cache;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import qhy.example.bean.job.JobBean;
import qhy.example.service.modules.job.service.JobService;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@SpringBootTest
class CacheApplicationTests {
	@Autowired
	JobService jobService;
	@Autowired
	RedisTemplate redisTemplate;
	@Test
	void contextLoads() throws Exception{

//		redisTemplate.opsForValue().set("A","测试存储字符串");
		Object a = redisTemplate.opsForValue().get("A");
		System.out.println(a);
//		for (int i = 0; i < 12; i++) {
//			JobBean jobBean = new JobBean();
//			jobBean.setBeanName("cache");
//			jobService.insert(jobBean);
//		}
		JobBean jobBean = new JobBean();
//		List<JobBean> list = jobService.list();
//
//		Page<JobBean> page = new Page<>(1, 2);
//		IPage<JobBean> mapPage = jobService.page(page,new QueryWrapper<JobBean>());
//		List<JobBean> records = mapPage.getRecords();
//		System.out.println(new ObjectMapper().writeValueAsString(records));
//
//		List<Map<String, Object>> maps = jobService.queryJobBeanList();
//
//		System.out.println(new ObjectMapper().writeValueAsString(maps));

			jobBean.setBeanName("cache");
			jobService.insert(jobBean);
			System.out.println(jobBean.getDataId());
	}

}
