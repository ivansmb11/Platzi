package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;

public class FundamentosApplicationBuilder {
    private ComponentDependency componentDependency;
    private MyBean myBean;

    public FundamentosApplicationBuilder setComponentDependency(ComponentDependency componentDependency) {
        this.componentDependency = componentDependency;
        return this;
    }

    public FundamentosApplicationBuilder setMyBean(MyBean myBean) {
        this.myBean = myBean;
        return this;
    }

    public FundamentosApplicationBuilder setMyBeanWithDependency(MyBeanWithDependency myBeanWithDependency) {
        this.myBeanWithDependency = myBeanWithDependency;
        return this;
    }

    public FundamentosApplication createFundamentosApplication() {
        return new FundamentosApplication(componentDependency, myBean, setMyBeanWithDependency());
    }
}