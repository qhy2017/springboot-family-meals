package qhy.example.service.modules.job.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qhy.example.bean.job.JobBean;
import qhy.example.service.modules.job.dao.JobBeanDao;
import qhy.example.service.modules.job.service.JobService;

import java.util.List;
import java.util.Map;
@Service
public class JobServiceImpl extends ServiceImpl<JobBeanDao, JobBean> implements JobService {
    @Autowired
    private JobBeanDao jobBeanDao;
    @Override
    public boolean insert(JobBean jobBean) {
        boolean save = this.save(jobBean);
        return save;
    }

    @Override
    public List<Map<String, Object>> queryJobBeanList() {
        List<Map<String, Object>> maps = jobBeanDao.queryJobBeanList();
        return maps;
    }


}
