package org.designer.test.statemachine.service;

import org.designer.test.statemachine.entity.WarehousingEnum;
import org.designer.test.statemachine.framework.entity.ServiceCommonBO;
import org.designer.test.statemachine.framework.service.BaseService;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/15 10:53
 */
@Component
public class AWarehousingServiceImpl implements BaseService<WarehousingEnum, ServiceCommonBO> {

    @Override
    public WarehousingEnum action(ServiceCommonBO bo) {
        return WarehousingEnum.待分拣;
    }

    @Override
    public WarehousingEnum getState() {
        return WarehousingEnum.待审核;
    }

}
