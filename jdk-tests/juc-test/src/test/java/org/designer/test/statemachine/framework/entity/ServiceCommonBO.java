package org.designer.test.statemachine.framework.entity;

import org.designer.test.statemachine.entity.WarehousingEnum;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/14 17:01
 */
public class ServiceCommonBO implements ServiceBO<WarehousingEnum> {

    private Long id;

    private WarehousingEnum warehousingEnum;

    public ServiceCommonBO(Long id, WarehousingEnum warehousingEnum) {
        this.id = id;
        this.warehousingEnum = warehousingEnum;
    }

    @Override
    public WarehousingEnum getState() {
        return warehousingEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWarehousingEnum(WarehousingEnum warehousingEnum) {
        this.warehousingEnum = warehousingEnum;
    }
}
