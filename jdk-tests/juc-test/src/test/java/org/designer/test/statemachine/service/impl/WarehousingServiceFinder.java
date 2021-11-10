package org.designer.test.statemachine.service.impl;

import org.designer.test.statemachine.framework.entity.ServiceBO;
import org.designer.test.statemachine.framework.service.ServiceFinder;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/15 10:07
 */
public interface WarehousingServiceFinder<E extends Enum<?>, BO extends ServiceBO<E>> extends ServiceFinder<E, BO> {


}
