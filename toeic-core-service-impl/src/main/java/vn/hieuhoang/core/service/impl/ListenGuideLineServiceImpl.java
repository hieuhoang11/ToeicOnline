package vn.hieuhoang.core.service.impl;

import vn.hieuhoang.core.dao.ListenGuideLineDao;
import vn.hieuhoang.core.daoimpl.ListenGuideLineDaoImpl;
import vn.hieuhoang.core.dto.ListenGuidelineDTO;
import vn.hieuhoang.core.persistance.entity.ListenGuideLineEntity;
import vn.hieuhoang.core.service.ListenGuideLineService;
import vn.hieuhoang.core.utils.ListenGuideLineBeanUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hieu Hoang on 27/09/2018.
 */
public class ListenGuideLineServiceImpl implements ListenGuideLineService {
    private ListenGuideLineDao guideLineDao = new ListenGuideLineDaoImpl();
    public Object[] findListenGuidelineByProperties(String property, Object value, String sortExpression, String sortDirection, Integer offset, Integer limit) {
        List<ListenGuidelineDTO> result = new ArrayList<ListenGuidelineDTO>();
        Object [] objects = guideLineDao.findByProperty(property,value,sortExpression,sortDirection,offset,limit);
        for (ListenGuideLineEntity item: (List<ListenGuideLineEntity>) objects[1]) {
            ListenGuidelineDTO dto = ListenGuideLineBeanUtil.entity2Dto(item);
            result.add(dto);
        }
        objects[1] = result;
        return objects;
    }
}
