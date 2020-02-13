package entity;

public class Worker {
    private String food;
    private String need;

    public String cookFood(){
        return "我拿到了"+food+"，做好了"+need+"，请传给用户";
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }
}
