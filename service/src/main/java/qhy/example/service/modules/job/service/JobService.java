package qhy.example.service.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import qhy.example.bean.job.JobBean;

import java.util.List;
import java.util.Map;

public interface JobService extends IService<JobBean> {

    boolean insert(JobBean jobBean);

    List<Map<String,Object>> queryJobBeanList();

    public List<Map> getSum();
}
