package Decorate.correctCode;

public abstract class CondimentDecorator extends Beverage{

    // 所有的调料必须重新实现这个方法
    public abstract String getDescription();

}
