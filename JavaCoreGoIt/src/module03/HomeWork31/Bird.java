package module03.HomeWork31;

class Bird {
    private String act;

    public Bird() {
        this.act = "singing";
    }

    public Bird(String act) {
        this.act = act;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String sing() {
        return "I am " + act;
    }
}
