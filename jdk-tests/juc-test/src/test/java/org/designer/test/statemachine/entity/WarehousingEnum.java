package org.designer.test.statemachine.entity;

/**
 * @description:
 * @author: Designer
 * @date : 2021/10/14 16:51
 */
public enum WarehousingEnum {
    待审核(true),
    待分拣(false),
    待收货(false),
    已收货(false),
    拒绝收货(false),
    已撤销(false);

    private boolean skip;

    WarehousingEnum(boolean skip) {
        this.skip = skip;
    }

    public boolean isSkip() {
        return skip;
    }

}
