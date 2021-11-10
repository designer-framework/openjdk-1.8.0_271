package org.designer.test.statemachine.service;

import org.designer.test.statemachine.entity.WarehousingEnum;
import org.designer.test.statemachine.framework.entity.ServiceCommonBO;
import org.designer.test.statemachine.framework.service.AbstractStateMachine;
import org.designer.test.statemachine.framework.service.ServiceFinder;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/15 9:59
 */
abstract class AbstractWarehousingStateMachine extends AbstractStateMachine<WarehousingEnum, ServiceCommonBO> {

    public AbstractWarehousingStateMachine(ServiceFinder<WarehousingEnum, ServiceCommonBO> delegate) {
        super(delegate);
    }

}
