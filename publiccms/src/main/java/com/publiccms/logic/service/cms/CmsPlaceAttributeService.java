package com.publiccms.logic.service.cms;

// Generated 2015-5-8 16:50:23 by com.sanluan.common.source.SourceGenerator

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.publiccms.entities.cms.CmsPlaceAttribute;
import com.sanluan.common.base.BaseService;

/**
 *
 * CmsPlaceAttributeService
 * 
 */
@Service
@Transactional
public class CmsPlaceAttributeService extends BaseService<CmsPlaceAttribute> {

    /**
     * @param placeId
     * @param data
     */
    public void updateAttribute(Long placeId, String data) {
        CmsPlaceAttribute attribute = getEntity(placeId);
        if (null != attribute) {
            attribute.setData(data);
        } else {
            if (notEmpty(placeId)) {
                save(new CmsPlaceAttribute(placeId, data));
            }
        }
    }
}