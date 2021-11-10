package org.designer.test.statemachine.service;

import org.designer.test.statemachine.entity.WarehousingEnum;
import org.designer.test.statemachine.framework.entity.ServiceCommonBO;
import org.designer.test.statemachine.framework.service.ServiceFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/14 18:05
 */
@Component
public class WarehousingStateMachine extends AbstractWarehousingStateMachine {

    @Autowired
    public WarehousingStateMachine(ServiceFinder<WarehousingEnum, ServiceCommonBO> delegate) {
        super(delegate);
    }

}
