package vn.hieuhoang.core.utils;

import vn.hieuhoang.core.dto.ListenGuidelineDTO;
import vn.hieuhoang.core.persistance.entity.ListenGuideLineEntity;

/**
 * Created by Hieu Hoang on 03/10/2018.
 */
public class ListenGuideLineBeanUtil {
    public static ListenGuidelineDTO entity2Dto (ListenGuideLineEntity entity) {
        ListenGuidelineDTO dto = new ListenGuidelineDTO();
        dto.setListenGuideLineId(entity.getListenGuideLineId());
        dto.setContent(entity.getContent());
        dto.setImage(entity.getImage());
        dto.setTitle(entity.getTitle());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setModifiedDate(entity.getModifiedDate());
        return dto;
    }

    public static ListenGuideLineEntity dto2Entity (ListenGuidelineDTO dto) {
        ListenGuideLineEntity entity = new ListenGuideLineEntity();
        entity.setListenGuideLineId(dto.getListenGuideLineId());
        entity.setContent(dto.getContent());
        entity.setImage(dto.getImage());
        entity.setTitle(dto.getTitle());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setModifiedDate(dto.getModifiedDate());
        return entity;
    }
}
