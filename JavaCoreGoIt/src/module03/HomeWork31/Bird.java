package module03.HomeWork31;

class Bird {
    private String act;

    Bird() {
        this.act = "singing";
    }

    Bird(String act) {
        this.act = act;
    }

    String getAct() {
        return act;
    }

    void setAct(String act) {
        this.act = act;
    }

    String sing() {
        return "I am " + act;
    }
}
