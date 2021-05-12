package qhy.example.service.modules.dao.dictionary;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import qhy.example.bean.dictionary.DictionaryEntity;

@Mapper
public interface DictionaryDao extends BaseMapper<DictionaryEntity> {


}
