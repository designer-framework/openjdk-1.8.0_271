package org.designer.test.statemachine.framework.service;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/15 11:19
 */
public interface ServiceAction<E, BO> {
    E action(BO bo);
}
