package skyming.designpatterns.strategy.base;

public class Context {
    Strategy strategy;

    public Context() {
    }

    public void setStrategy(Strategy s){
        this.strategy = s;
    }
    public void doSomething(){
//        strategy.behavior();
    }
}
