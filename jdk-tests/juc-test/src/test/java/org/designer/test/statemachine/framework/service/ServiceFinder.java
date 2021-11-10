package org.designer.test.statemachine.framework.service;

import org.designer.test.statemachine.framework.entity.ServiceBO;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/15 10:07
 */
public interface ServiceFinder<E extends Enum<?>, BO extends ServiceBO<E>> {

    BaseService<E, BO> getService(E state);

}
