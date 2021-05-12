package qhy.example.service.modules.service.dictionary.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qhy.example.bean.dictionary.DictionaryEntity;
import qhy.example.service.modules.dao.dictionary.DictionaryDao;
import qhy.example.service.modules.service.dictionary.DictionaryService;

@Service
public class DictionaryServiceImpl extends ServiceImpl<DictionaryDao, DictionaryEntity> implements DictionaryService {

    @Autowired
    DictionaryDao dictionaryDao;
}
