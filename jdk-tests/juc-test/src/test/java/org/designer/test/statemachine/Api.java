package org.designer.test.statemachine;

import org.designer.test.statemachine.entity.AServiceBO;
import org.designer.test.statemachine.entity.WarehousingEnum;
import org.designer.test.statemachine.service.WarehousingStateMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/14 17:09
 */
@Component
public class Api {

    @Autowired
    private WarehousingStateMachine warehousingStateMachine;

    public WarehousingEnum 审批通过() {
        return warehousingStateMachine.action(new AServiceBO(1L, WarehousingEnum.待审核));
    }


}
