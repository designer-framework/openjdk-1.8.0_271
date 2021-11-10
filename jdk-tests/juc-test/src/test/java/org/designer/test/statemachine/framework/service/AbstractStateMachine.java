package org.designer.test.statemachine.framework.service;

import org.designer.test.statemachine.framework.entity.ServiceBO;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/15 10:59
 */
public abstract class AbstractStateMachine<E extends Enum<?>, BO extends ServiceBO<E>> implements ServiceAction<E, BO> {

    private final ServiceFinder<E, BO> delegate;

    public AbstractStateMachine(ServiceFinder<E, BO> delegate) {
        this.delegate = delegate;
    }

    @Override
    public E action(BO bo) {
        BaseService<E, BO> service = delegate.getService(bo.getState());
        if (service == null) {
            throw new IllegalStateException((String) null);
        } else {
            return service.action(bo);
        }
    }

}
