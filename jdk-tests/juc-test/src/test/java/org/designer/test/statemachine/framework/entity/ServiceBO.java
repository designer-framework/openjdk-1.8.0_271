package org.designer.test.statemachine.framework.entity;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/14 16:56
 */
public interface ServiceBO<E extends Enum<?>> {
    E getState();
}
