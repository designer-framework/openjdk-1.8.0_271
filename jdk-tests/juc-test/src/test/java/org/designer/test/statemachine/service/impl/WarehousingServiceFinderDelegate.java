package org.designer.test.statemachine.service.impl;

import org.designer.test.statemachine.entity.WarehousingEnum;
import org.designer.test.statemachine.framework.entity.ServiceCommonBO;
import org.designer.test.statemachine.framework.service.BaseService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/15 10:03
 */
@Component
public class WarehousingServiceFinderDelegate implements WarehousingServiceFinder<WarehousingEnum, ServiceCommonBO> {

    private final Map<WarehousingEnum, BaseService<WarehousingEnum, ServiceCommonBO>> service;

    public WarehousingServiceFinderDelegate(List<BaseService<WarehousingEnum, ServiceCommonBO>> service) {
        this.service = service.stream()
                .collect(Collectors.toMap(BaseService::getState, s -> s));
    }

    @Override
    public BaseService<WarehousingEnum, ServiceCommonBO> getService(WarehousingEnum state) {
        return service.get(state);
    }

}
