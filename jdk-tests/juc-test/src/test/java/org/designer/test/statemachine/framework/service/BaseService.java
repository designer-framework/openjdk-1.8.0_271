package org.designer.test.statemachine.framework.service;

import org.designer.test.statemachine.entity.WarehousingEnum;
import org.designer.test.statemachine.framework.entity.ServiceBO;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/15 10:17
 */
public interface BaseService<E extends Enum<?>, BO extends ServiceBO<E>> extends ServiceAction<E, BO> {

    E getState();

    default boolean match(WarehousingEnum warehousingEnum) {
        return getState() == warehousingEnum;
    }


}
