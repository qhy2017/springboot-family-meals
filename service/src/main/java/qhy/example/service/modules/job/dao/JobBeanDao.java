package qhy.example.service.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import qhy.example.bean.job.JobBean;

import java.util.List;
import java.util.Map;

/**
 * 定时任务bean
 *@auth qhy
 *@email 1242359237@qq.com
 *@date 2020/5/14 19:58
 */
@Mapper
public interface JobBeanDao extends BaseMapper<JobBean> {

    List<Map<String,Object>> queryJobBeanList();
}
