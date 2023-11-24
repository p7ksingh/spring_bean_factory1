package FactoryBeanEx;

public class FactoryBean {
    public IndianNames getIndianNames() {
        return new IndianNames();
    }

    public UsNames getUsNames() {
        return new UsNames();
    }
}
